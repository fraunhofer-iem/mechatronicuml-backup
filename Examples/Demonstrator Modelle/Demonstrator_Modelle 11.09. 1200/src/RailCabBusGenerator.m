
%BusElement('rc1','Bus',,'PacketBus')
BusElements(1) = Simulink.BusElement;
BusElements(1).Name = 'rc1';
BusElements(1).DataType = 'PacketBus';

%BusElement('rc2','Bus',,'PacketBus')
BusElements(2) = Simulink.BusElement;
BusElements(2).Name = 'rc2';
BusElements(2).DataType = 'PacketBus';

%BusElement('rc3','Bus',,'PacketBus')
BusElements(3) = Simulink.BusElement;
BusElements(3).Name = 'rc3';
BusElements(3).DataType = 'PacketBus';

%BusElement('rc4','Bus',,'PacketBus')
BusElements(4) = Simulink.BusElement;
BusElements(4).Name = 'rc4';
BusElements(4).DataType = 'PacketBus';

%BusElement('rc5','Bus',,'PacketBus')
BusElements(5) = Simulink.BusElement;
BusElements(5).Name = 'rc5';
BusElements(5).DataType = 'PacketBus';

%BusElement('rc6','Bus',,'PacketBus')
BusElements(6) = Simulink.BusElement;
BusElements(6).Name = 'rc6';
BusElements(6).DataType = 'PacketBus';


%Bus('RailCabBus')
RailCabBus = Simulink.Bus;
RailCabBus.Elements = BusElements;
clear BusElements;

