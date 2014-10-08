
%BusElement('rc1','Bus',1,'PacketBus')
BusElements(1) = Simulink.BusElement;
BusElements(1).Name = 'rc1';
BusElements(1).DataType = 'PacketBus';

%BusElement('rc2','Bus',1,'PacketBus')
BusElements(2) = Simulink.BusElement;
BusElements(2).Name = 'rc2';
BusElements(2).DataType = 'PacketBus';

%BusElement('rc3','Bus',1,'PacketBus')
BusElements(3) = Simulink.BusElement;
BusElements(3).Name = 'rc3';
BusElements(3).DataType = 'PacketBus';

%BusElement('rc4','Bus',1,'PacketBus')
BusElements(4) = Simulink.BusElement;
BusElements(4).Name = 'rc4';
BusElements(4).DataType = 'PacketBus';


%Bus('MainBus')
MainBus = Simulink.Bus;
MainBus.Elements = BusElements;
clear BusElements;

