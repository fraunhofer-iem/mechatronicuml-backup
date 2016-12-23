
%BusElement('rc1','Bus',1,'PacketBus')
BusElements(1) = Simulink.BusElement;
BusElements(1).Name = 'rc1';
BusElements(1).DataType = 'PacketBus';

%BusElement('rc2','Bus',1,'PacketBus')
BusElements(2) = Simulink.BusElement;
BusElements(2).Name = 'rc2';
BusElements(2).DataType = 'PacketBus';


%Bus('MainBus')
MainBus = Simulink.Bus;
MainBus.Elements = BusElements;
clear BusElements;

