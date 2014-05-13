#########################################################################
#                                   README.txt                          #
#                                   mum-build.py                        #
#       inspired by: https://github.com/ferstl/eclipse-builder          #
#                                                                       #
#                                                                       #
#########################################################################


# MUML Eclipse Builder (muml-build.py)
    * creates a custom Eclipse distribution

# Requirements
    * Python >= 2.7.5
    * An Eclipse distribution which contains the P2 Director application
    * One or more configuration files

# Arguments
    * the python script (muml-build.py) takes exactly 4 arguments
    * 1. The path to an executable eclipse file, which is used to build the distribution
    * 2. The name of the new Eclipse Distribution in " "
    * 3. The destination path, where the new Eclipse Distribution should be stored
    * 4. The path to the Configuration Files, which shall be used to build the new Eclipse Distribution

# Configuration File(s)
    * A Configuration File contains the information what shall be installed into the new Eclipse Distribution
    * A Configuration File has the file extension *.conf
    * !!! Important Note:!!!!! If you use more than one Configuration File and the installable Units in the Configuration Files depend on each other sort them in alphabetical order
        * Example: Config File "A": contains some installable Units; Config File "B": contains installable Units which depends on the installable Units from Config File "A"
            --> Name the Configuration Files as follows: Config File A -- "A.conf"; Config File B --"B.conf" 
        * since the Configuration Files are evaluated in alphabetical order

## Format of a Configuration File:
    * A Configuration File must be in the following format:
            useRemoteURL:yes 
            remote-url:http://download.eclipse.org/releases/kepler
            local-url:file:///home/me/repos/eclipse-kepler
            tag:Eclipse SDK
            iu:com.google.guava
            iu:...
            iu:...

    *   Parameter       |       Value       |   Description
    --------------------------------------------------------
        useRemoteURL    |       yes | no    |   Determines if the remote or local Update Site shall be used to get the installable Units
        remote-url      |       URL         |   A URL to a "remote" Update Site which provides the installable Units
        local-url       |       URL         |   A URL to a "local"  Update Site where toe installable Units are stored
        tag             |       String      |   The name of the installation, which will be shown in the installation history of the new Eclipse Distribution
        iu              |       Name of IU  |   The name of an installable Unit (IU) (e.g., plugin or a feature.group) which shall be installed, (the same name as provided by the Update Site)