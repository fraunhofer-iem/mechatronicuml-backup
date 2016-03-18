require 'udbm-sys'
require 'socket'

include UDBM

#state constants
Idle = 0
CreateContextReq = 1
CreateContextAck = 2
ClockVarDefReq = 3
ClockVarDefAck = 4
ExecuteFedOperation = 5
CheckFedProperty = 6
ShutdownReceived = 16

#return format variable
returnFormat = 0 # 0 = return matrix, 1 = return minimum constraint string

#socket location
hostname = 'localhost'
port = 8326

#serialize the matrix such that it can be sent over the socket
def serializeFed(fed,context)
  returnString = ""
  zones = fed.to_a
  
  if zones.length==0
    return "false"
  end
  
  for j in 0...zones.length
    returnString += zones[j].to_s
  
    if(!(j == zones.length-1))
      returnString += "|"
    end
  end
  returnString.gsub!(/[\n]/, "&");

  return returnString
end

#print a string for the current state
def printState(state)
  returnString = ""
  case
    when state == Idle
      returnString = "Idle"
    when state == CreateContextReq
      returnString = "CreateContextReq"
    when state == CreateContextAck
      returnString = "CreateContextAck"
    when state == ClockVarDefReq
      returnString = "ClockVarDefReq"
    when state == ClockVarDefAck
      returnString = "ClockVarDefAck"
    when state == ExecuteFedOperation
      returnString = "ExecuteFedOperation"
    when state == CheckFedProperty
      returnString = "CheckFedProperty"
    when state == ShutdownReceived
      returnString = "ShutdownReceived"
  end  
  return returnString
end

if __FILE__ == $0
  
  debugMode = false
  
  unless defined?(BLOCKSIZE)
  #Iterate the array containing command line arguments
  ARGV.each_with_index do |arg, index|
  #check for options
  if arg == "-debug"
    debugMode = true
  elsif arg == "-mcr"
    returnFormat = 1
  elsif arg == "-host"
    hostname = ARGV[index + 1]
  elsif arg == "-port"
    port = ARGV[index + 1]
  end
end

  debugMode = ARGV.include?("-debug")
  if (ARGV.include?("-mcr"))
    returnFormat = 1
  end
  end
  
  serverSocket = TCPServer.new(hostname, port)
  switchedToIdle = false
  exit=false
  currentState = Idle
  contextCounter = 0;
  
  if debugMode
    puts "udbmServer running in debug mode...\n\n"
  else
    puts "udbmServer running ...\n\n"
  end

  while ((exit==false) && (clientSocket = serverSocket.accept))
    switchedToIdle = false
    currentState = Idle
    
    serverPort = clientSocket.addr[1]
    clientPort = clientSocket.peeraddr[1]
    name = clientSocket.peeraddr[2]
    addr = clientSocket.peeraddr[3]
    
    if debugMode
      puts "*** receiving from #{addr}(#{name}):#{clientPort} on #{serverPort}"
    end
    
    while ((exit==false) && (receivedMessage = clientSocket.gets))
      receivedMessage = receivedMessage.strip
      if debugMode
         puts "CurrentState: #{printState(currentState)}"
         puts "Received: #{receivedMessage}"
      end
    
      case 
        when currentState==Idle && receivedMessage=="createContextReq"
        contextCounter+=1
        clientSocket.puts "createContextAck#{contextCounter}"
        currentState = CreateContextReq
        
        when currentState==CreateContextReq && receivedMessage=~/\Ax\d*=Context.create/
        c = eval receivedMessage
        clientSocket.puts "contextCreated"
        currentState = CreateContextAck
        
        when (currentState==Idle || currentState==CreateContextAck) && receivedMessage=="clockVarDefReq"
        clientSocket.puts "clockVarDefAck"
        currentState = ClockVarDefReq
        
        when currentState==ClockVarDefReq
        receivedMessage.gsub!(/[;]/, "\n");
        eval receivedMessage
        clientSocket.puts "clockVarDefined"
        currentState = ClockVarDefAck
        
        when (currentState==ClockVarDefAck) && receivedMessage=="executeFedOpReq"
        clientSocket.puts "executeFedOpAck"
        currentState = ExecuteFedOperation
        
        when currentState==ExecuteFedOperation
        i = eval receivedMessage
        i.and!(c.true)
        if debugMode
          puts i.fed
        end
        
        #return result to client
        if (returnFormat == 1)
          clientSocket.puts i.to_s()
        else
          clientSocket.puts serializeFed(i.fed, c)
        end
        
        #print result if in debug mode
        if debugMode
          if (returnFormat == 1)
            puts i.to_s()
          else 
            puts "Answered: " + serializeFed(i.fed, c)
          end
        end
        currentState = ClockVarDefAck
        
        when currentState==ClockVarDefAck && receivedMessage=="checkFedPropertyReq"
        clientSocket.puts "checkFedPropertyAck"
        currentState = CheckFedProperty
        
        when currentState==CheckFedProperty
        r = eval receivedMessage
        clientSocket.puts r.to_s
        if debugMode
          puts "Answered: " + r.to_s
        end
        currentState = ClockVarDefAck
        
        
        when receivedMessage=="disconnect"
        currentState = Idle
        
        when receivedMessage=="shutdown"
        currentState = ShutdownReceived
        exit=true
      end
      
      if debugMode
        puts "CurrentState: #{printState(currentState)}"
      end
    end
  end
end