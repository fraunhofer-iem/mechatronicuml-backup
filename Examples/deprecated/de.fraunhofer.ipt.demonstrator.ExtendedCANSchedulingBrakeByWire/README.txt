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


Im Prinzip sind die Formeln aus Abschnitt 3 implementiert. Der "grobe"
Ablauf ist wie folgt:

Startpunkt ist "canRTA":
- possibleMessages: Menge von Mengen von Nachrichten, wobei die Nachrichten
   innerhalb einer Menge eine Busauslastung < 1 haben
- fuer jede dieser Mengen machen wir eine RTA
- blockingTime: entspricht Equation (5)
- busyPeriod; entspricht Equation (8)
- die Operation calculateWorstCaseResponseTimeTuples berechnet nun die
   notwendigen Tuples, wobei die eigentliche "Arbeit" von der Operation
   calculateWorstCaseResponseTimeLvalTuples erledigt wird

Spaeter wird calculateWorstCaseResponseTime aufgerufen. Dort wird fuer jede potentielle "Nachrichteninstanz" der _aktuell_ betrachteten Nachricht eine RTA ausgefuehrt (calculateWorstCaseResponseTimeForInstanceq) - der Code in calculateWaitTimeForInstanceq entspricht im Wesentlichen Equation (13).

calculateWorstCaseResponseTimeForInstanceq entspricht Equation (12) (J_m ist bei uns 0 / taucht nicht auf, da derzeit vom Jitter abstrahiert wird).
Um in Equation (12) w_m(q) zu berechnen, wird calculateWaitTimeForInstanceq aufgerufen (dieser Aufruf berechnet Equation (11)).

