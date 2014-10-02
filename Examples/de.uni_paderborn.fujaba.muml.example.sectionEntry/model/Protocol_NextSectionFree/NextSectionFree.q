//This file was generated from (Academic) UPPAAL 4.0.11 (rev. 4492), February 2010

/*

*/
E<> (switch1.WaitForSection)

/*

*/
(switch1.WaitForSection --> switch1.Idle)

/*

*/
A[] ( (track1.Idle and switch1.Idle)  imply  (track1.free == switch1.status)  )

/*

*/
A[] not deadlock
