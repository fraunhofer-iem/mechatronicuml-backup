//This file was generated from (Academic) UPPAAL 4.1.18 (rev. 5444), November 2013

/*

*/
A[] overflow == 0

/*

*/
peer_1.Slave_ACTIVE_IN_peer --> peer_2.Master_ACTIVE_IN_peer2

/*

*/
peer_1.Master_ACTIVE_IN_peer --> peer_2.Slave_ACTIVE_IN_peer2

/*

*/
E<> peer_1.Master_ACTIVE_IN_peer

/*

*/
E<> peer_1.Slave_ACTIVE_IN_peer

/*

*/
E<> peer_1.Failed_ACTIVE_IN_peer

/*

*/
A[] not deadlock
