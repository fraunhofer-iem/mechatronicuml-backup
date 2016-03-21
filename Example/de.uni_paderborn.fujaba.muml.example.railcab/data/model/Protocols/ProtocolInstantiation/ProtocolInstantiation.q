//This file was generated from (Academic) UPPAAL 4.0.11 (rev. 4492), February 2010

/*

*/
E<> requestor.Success

/*

*/
requestee.Failed --> requestor.Aborted

/*

*/
requestee.Abort --> requestor.NotSupported

/*

*/
requestee.Finished --> requestor.Success

/*

*/
A[] not deadlock
