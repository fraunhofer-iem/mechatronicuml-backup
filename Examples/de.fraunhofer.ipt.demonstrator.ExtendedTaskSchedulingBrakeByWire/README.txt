This model enables to test the EDF Task Scheduling for preemptive, periodic tasks that have a deadline and WCET.
Priorities are dynamic based on the relative deadline. This formula is a sufficient condition for schedulability for task sets
scheduled according to EDF under the assumption  deadline <= periode and all tasks  are periodic

EDF is based on the papers Modeling and efficient solving of extra-functional properties for
adaptation in networked embedded real-time systems
Marc Zeller, Christian Prehofer 
http://ac.els-cdn.com/S1383762112001038/1-s2.0-S1383762112001038-main.pdf?_tid=3397bb2a-cb56-11e5-bb92-00000aab0f26&acdnat=1454600859_4163d925c7897ce67882be8e16f1f811
and C.L. Liu, J.W. Layland, Scheduling algorithms for multiprogramming in a hardreal-time
environment, Journal of the ACM 20 (1973) 46–61 www.di.ens.fr/~pouzet/cours/systeme/bib/liu73.pdf
NO VALID ALLOCATION IS FOUND. THE DEFINED TASKS HAVE NO MEANINGFUL PROPERTIES. USE TH ASL EVALUTAION VIEW TO TEST THE CONSTRAINTS!
THE FOLLOWING ComponentInstances from the calliper PART HAVE SCHEDULING EXTENSIONS: sc1, sc2, sc3.

This model enables to test the RTA Task Scheduling for preemptive, periodic tasks that have a deadline and WCET 
Priorities are fixed. 
The RTA is a sufficient and
necessary condition for schedulability for preemptive task sets
with arbitrary fixed priorities [17]. By using the upper bound for
response times introduced in [18], t

[17] K. Becker, M. Zeller, G. Weiss, Towards efficient on-line schedulability tests for
adaptive networked embedded real-time systems, in: Proceedings of the
Second International Conference on Pervasive and Embedded Computing and
Communication Systems (PECCS), 2012, pp. 440–449.
[18] R. Davis, A. Burns, Response time upper bounds for fixed priority real-time
systems, in: Proceedings of the 29th IEEE Real-Time Systems Symposium,
2008, pp. 407–418.

