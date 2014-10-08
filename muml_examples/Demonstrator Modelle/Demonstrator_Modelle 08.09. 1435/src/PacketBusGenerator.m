
%BusElement('from','uint8',10,)
BusElements(1) = Simulink.BusElement;
BusElements(1).Name = 'from';
BusElements(1).DataType = 'uint8';
BusElements(1).Dimensions = 10;
%BusElement('to','uint8',10,)
BusElements(2) = Simulink.BusElement;
BusElements(2).Name = 'to';
BusElements(2).DataType = 'uint8';
BusElements(2).Dimensions = 10;
%BusElement('msg','uint16',10,)
BusElements(3) = Simulink.BusElement;
BusElements(3).Name = 'msg';
BusElements(3).DataType = 'uint16';
BusElements(3).Dimensions = 10;
%BusElement('param','double',10,)
BusElements(4) = Simulink.BusElement;
BusElements(4).Name = 'param';
BusElements(4).DataType = 'double';
BusElements(4).Dimensions = 10;
%BusElement('pkgid','uint32',10,)
BusElements(5) = Simulink.BusElement;
BusElements(5).Name = 'pkgid';
BusElements(5).DataType = 'uint32';
BusElements(5).Dimensions = 10;
%BusElement('time','double',10,)
BusElements(6) = Simulink.BusElement;
BusElements(6).Name = 'time';
BusElements(6).DataType = 'double';
BusElements(6).Dimensions = 10;

%Bus('PacketBus')
PacketBus = Simulink.Bus;
PacketBus.Elements = BusElements;
clear BusElements;

