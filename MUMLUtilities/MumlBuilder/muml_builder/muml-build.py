import os
import re
import argparse
#os.system shall be replaced by subprocess

## some "Constants"
P2_PLATFORM_OPTS = {}
P2_PLATFORM_OPTS["linux"] = "-p2.os linux -p2.ws gtk -p2.arch x86_64"
P2_PLATFORM_OPTS["linux32"] = "-p2.os linux -p2.ws gtk -p2.arch x86"
P2_PLATFORM_OPTS["macosx"] = "-p2.os macosx -p2.ws cocoa -p2.arch x86_64"
P2_PLATFORM_OPTS["windows"] = "-p2.os win32 -p2.ws win32 -p2.arch x86_64"
P2_PLATFORM_OPTS["windows32"] = "-p2.os win32 -p2.ws win32 -p2.arch x86"

P2_DEST_SUFFIX = {}
P2_DEST_SUFFIX["linux"] = "linux-gtk-x86_64"
P2_DEST_SUFFIX["linux32"] = "linux-gtk-x86"
P2_DEST_SUFFIX["macosx"] = "macosx-cocoa-x86_64"
P2_DEST_SUFFIX["windows"] = "win32-x86_64"
P2_DEST_SUFFIX["windows32"] = "win32-x86"


#read one configuration file and return the url, the optional tag, and the installable Units as a list 
def readConfigFile(filename, useLocalURL=False):
    installableUnits = []
    tag = ""
    with open(filename, "rU") as file:
        urlToUse = next(file).strip().split("useRemoteURL:")[1]
        if urlToUse.lower() == "no":
            useLocalURL = True
        url = next(file).strip().split("remote-url:")[1]
        localURL = next(file).strip().split("local-url:")[1]
        contents = next(file).split(":")
        if contents[0] == "tag":
            tag = contents[1].rstrip("\n")
        else:
            installableUnits.append(contents[1].rstrip("\n"))
        for line in file:
            if line.strip():
                contents = line.split("iu:")
                installableUnits.append(contents[1].rstrip("\n"))
    if useLocalURL:
        url = localURL
    return url, tag, installableUnits

#install one configuration file in the eclipse destribution for the given platform and destination
def install(eclipseFile, distro_name, destination, configFile, platform):
    print("Installing Plugins from File:"+str(configFile))
    url, tag, uis = readConfigFile(configFile)
    destination += os.path.join(os.sep+distro_name + "-" + P2_DEST_SUFFIX[platform],  distro_name) 
    install_cmd = eclipseFile
    install_cmd += " -nosplash -application org.eclipse.equinox.p2.director -profile SDKProfile -profileProperties org.eclipse.update.install.features=true -roaming "
    install_cmd += P2_PLATFORM_OPTS[platform]
    install_cmd += " -destination {0}".format(destination)
    install_cmd += " -bundlepool {0}".format(destination)
   # install_cmd += " -tag {0}".format(str(tag))
    install_cmd += " -repository {0}".format(str(url))
    install_cmd += " -installIU {0}".format(',\\'.join(uis))
    error = os.system(install_cmd)
    if int(error) != 0:
    	exit(-1)
    print(str(configFile)+" sucessfully installed")


def createEclipseDistribution(eclipseFile, distro_name, destination, dir_ConfigFiles, platforms=P2_PLATFORM_OPTS):
    configFiles = sorted([f for f in os.listdir(dir_ConfigFiles) if f.endswith(".conf")])
    for platform in platforms:
        print("Create Eclipse Distribtuon {0} for {1}".format(distro_name, platform))
        for f in configFiles:
            install(eclipseFile, distro_name, destination, dir_ConfigFiles + os.sep + f, platform)
        print("Eclipse Distribtuon {0} for {1} sucessfully created".format(distro_name, platform))





if __name__ == '__main__':
    parser = argparse.ArgumentParser(description="muml-build.py eclipseFile distrName destination configDir")
    parser.add_argument("eclipeFileLocation", help="Location of Eclipse to build Distributions")
    parser.add_argument("distributionName", help="Name of the new Distribution in \" \" ")
    parser.add_argument("destinationDir", help="The Directory in which the new Distributions shall be created")
    parser.add_argument("configDir", help="Directory of the *.conf files")
    parser.add_argument("--platform", help="For which platform the distribution shall be build: linux, linux32, windows, windows32, macosx", nargs='*')
    options = parser.parse_args()
    if options.platform:
        createEclipseDistribution(os.path.abspath(options.eclipeFileLocation), re.escape(options.distributionName), os.path.abspath(options.destinationDir), os.path.abspath(options.configDir), options.platform)
    else:
        createEclipseDistribution(os.path.abspath(options.eclipeFileLocation), re.escape(options.distributionName), os.path.abspath(options.destinationDir), os.path.abspath(options.configDir))
    exit(0)
    