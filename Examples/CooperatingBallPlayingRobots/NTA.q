//This file was generated from (Academic) UPPAAL 4.0.13 (rev. 4577), September 2010

/*
when the robots are playing, they will stop playing eventually.
*/
TurnTransmission_PartnerA_0.MyTurn_ACTIVE_IN_TurnTransmission_PartnerA --> TurnTransmission_PartnerA_0.Initial_ACTIVE_IN_TurnTransmission_PartnerA

/*
There will never be a deadlock in the protocol.
*/
A[] not deadlock

/*
Partner B is able to go to state MyTurn.
*/
E<> TurnTransmission_PartnerB_1.MyTurn_ACTIVE_IN_TurnTransmission_PartnerB
