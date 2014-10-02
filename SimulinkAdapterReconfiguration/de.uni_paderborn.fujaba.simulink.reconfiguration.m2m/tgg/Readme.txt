##############################################
#
# Important Information
#
##############################################

The SimulinkReconfiguration.tgg is a child transformation of the basic transformation
de.uni_paderborn.fujaba.simulink.m2m/tgg/fujaba2simulink.tgg. Since the reference
childTransformation is bidirectional and since the basic transformation shall be
independent of the SimulinkReconfiguration.tgg transformation, this reference is not
set in the model files!
 
For editing SimulinkReconfiguration.tgg, you need to apply the Patches in the "Patches" folder
to both .tgg files. Please make sure that you do remove the childTransformation reference before
checking in.
