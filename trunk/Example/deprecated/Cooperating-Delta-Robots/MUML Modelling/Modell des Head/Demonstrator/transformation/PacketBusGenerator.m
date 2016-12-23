
%BusElement('from','uint8',1,)
BusElements(1) = Simulink.BusElement;
BusElements(1).Name = 'from';
BusElements(1).DataType = 'uint8';

%BusElement('to','uint8',1,)
BusElements(2) = Simulink.BusElement;
BusElements(2).Name = 'to';
BusElements(2).DataType = 'uint8';

%BusElement('msg','uint16',1,)
BusElements(3) = Simulink.BusElement;
BusElements(3).Name = 'msg';
BusElements(3).DataType = 'uint16';

%BusElement('param','double',1,)
BusElements(4) = Simulink.BusElement;
BusElements(4).Name = 'param';
BusElements(4).DataType = 'double';

%BusElement('pkgid','uint32',1,)
BusElements(5) = Simulink.BusElement;
BusElements(5).Name = 'pkgid';
BusElements(5).DataType = 'uint32';

%BusElement('time','double',1,)
BusElements(6) = Simulink.BusElement;
BusElements(6).Name = 'time';
BusElements(6).DataType = 'double';


%Bus('PacketBus')
PacketBus = Simulink.Bus;
PacketBus.Elements = BusElements;
clear BusElements;

