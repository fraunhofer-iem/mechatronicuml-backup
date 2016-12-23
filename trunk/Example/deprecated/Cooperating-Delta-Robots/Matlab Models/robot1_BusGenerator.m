
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


%Bus('robot1_Bus')
robot1_Bus = Simulink.Bus;
robot1_Bus.Elements = BusElements;
clear BusElements;

