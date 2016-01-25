import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Properties;

public class PropertiesCheck {
    
    private String licenseText = "Eclipse Foundation Software User Agreement\n April 9, 2014\n \n Usage Of Content\n \n THE ECLIPSE FOUNDATION MAKES AVAILABLE SOFTWARE, DOCUMENTATION, INFORMATION AND/OR\n OTHER MATERIALS FOR OPEN SOURCE PROJECTS (COLLECTIVELY \"CONTENT\").\n USE OF THE CONTENT IS GOVERNED BY THE TERMS AND CONDITIONS OF THIS\n AGREEMENT AND/OR THE TERMS AND CONDITIONS OF LICENSE AGREEMENTS OR\n NOTICES INDICATED OR REFERENCED BELOW.  BY USING THE CONTENT, YOU\n AGREE THAT YOUR USE OF THE CONTENT IS GOVERNED BY THIS AGREEMENT\n AND/OR THE TERMS AND CONDITIONS OF ANY APPLICABLE LICENSE AGREEMENTS\n OR NOTICES INDICATED OR REFERENCED BELOW.  IF YOU DO NOT AGREE TO THE\n TERMS AND CONDITIONS OF THIS AGREEMENT AND THE TERMS AND CONDITIONS\n OF ANY APPLICABLE LICENSE AGREEMENTS OR NOTICES INDICATED OR REFERENCED\n BELOW, THEN YOU MAY NOT USE THE CONTENT.\n \n Applicable Licenses\n \n Unless otherwise indicated, all Content made available by the\n Eclipse Foundation is provided to you under the terms and conditions of\n the Eclipse Public License Version 1.0 (\"EPL\"). A copy of the EPL is\n provided with this Content and is also available at http://www.eclipse.org/legal/epl-v10.html.\n For purposes of the EPL, \"Program\" will mean the Content.\n \n Content includes, but is not limited to, source code, object code,\n documentation and other files maintained in the Eclipse Foundation source code\n repository (\"Repository\") in software modules (\"Modules\") and made available\n as downloadable archives (\"Downloads\").\n \n \t- Content may be structured and packaged into modules to facilitate delivering,\n \t  extending, and upgrading the Content. Typical modules may include plug-ins (\"Plug-ins\"),\n \t  plug-in fragments (\"Fragments\"), and features (\"Features\").\n \t- Each Plug-in or Fragment may be packaged as a sub-directory or JAR (Java(TM) ARchive)\n \t  in a directory named \"plugins\".\n \t- A Feature is a bundle of one or more Plug-ins and/or Fragments and associated material.\n \t  Each Feature may be packaged as a sub-directory in a directory named \"features\".\n \t  Within a Feature, files named \"feature.xml\" may contain a list of the names and version\n \t  numbers of the Plug-ins and/or Fragments associated with that Feature.\n \t- Features may also include other Features (\"Included Features\"). Within a Feature, files\n \t  named \"feature.xml\" may contain a list of the names and version numbers of Included Features.\n \n The terms and conditions governing Plug-ins and Fragments should be\n contained in files named \"about.html\" (\"Abouts\"). The terms and\n conditions governing Features and Included Features should be contained\n in files named \"license.html\" (\"Feature Licenses\"). Abouts and Feature\n Licenses may be located in any directory of a Download or Module\n including, but not limited to the following locations:\n \n \t- The top-level (root) directory\n \t- Plug-in and Fragment directories\n \t- Inside Plug-ins and Fragments packaged as JARs\n \t- Sub-directories of the directory named \"src\" of certain Plug-ins\n \t- Feature directories\n \n Note: if a Feature made available by the Eclipse Foundation is installed using the\n Provisioning Technology (as defined below), you must agree to a license (\"Feature Update License\") during the installation process. If the Feature contains\n Included Features, the Feature Update License should either provide you\n with the terms and conditions governing the Included Features or inform\n you where you can locate them. Feature Update Licenses may be found in\n the \"license\" property of files named \"feature.properties\" found within a Feature.\n Such Abouts, Feature Licenses, and Feature Update Licenses contain the\n terms and conditions (or references to such terms and conditions) that\n govern your use of the associated Content in that directory.\\n";

    public static void main(String[] args) throws IOException {
        new PropertiesCheck().run(args[0]);
    }

    public void run(String filename) throws IOException {
        Properties properties = new Properties();
        File file = new File(filename);
        properties.load(new InputStreamReader(new FileInputStream(new File(filename))));
        properties.setProperty("providerName", "Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, and Fraunhofer Research Institution for​ Mechatronic Systems Design IEM, Germany");
        properties.setProperty("copyright", "Copyright (C) Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, and Fraunhofer Research Institution for​ Mechatronic Systems Design IEM, Germany\n All rights reserved. This program and the accompanying materials \n are made available under the terms of the Eclipse Public License v1.0\n which accompanies this distribution, and is available at\n http://www.eclipse.org/legal/epl-v10.html\n");
        properties.setProperty("license", licenseText);
        properties.store(new OutputStreamWriter(new FileOutputStream(file)), "");
    }

}
