Hi,

anbei das Modell + allocation_specification fuer die CAN RTA (siehe die Constraints "canRTA" und "busUtilization").
Ich habe zunaechst mal das Beispiel aus dem CAN Paper [1] nachgebaut (eine konkrete Berechnung findet sich z.B. in Abschnitt 3.3).

Folgende Komponenten Port Paare wurden annotiert (CANMessageFrame Extension):
- sc1, c1 (entspricht Message "A" aus dem Paper)
- sc2, c1 (entspricht Message "B" aus dem Paper)
- sc4, c3 (entspricht Message "C" aus dem Paper)

Der CAN-Bus mit dem Namen "CAN-Bus-Brake-Platform" befindet sich in der "Brake.0" Platform.


Marcus

[1] http://link.springer.com/article/10.1007%2Fs11241-007-9012-7
