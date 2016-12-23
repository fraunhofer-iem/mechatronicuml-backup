
Creating a portable, executable file from a ruby script.


Windows:

 1. You need to have ruby and the UDBM Ruby binding installed on your machine (see folder RubyInstall in this project for more information)
 2. Open a command window and switch to the root folder of this project.
 3. Run the command
 		ruby rubyscript2exe.rb .\udbmServer\init.rb
 4. Server reports to be running.
 5. Open Eclipse containing your Java development environment and go to the RubyUDBMBinding plugin.
 6. Run the JUnit test RubyClientShutdownTest.java located in the test/ package.
 7. This causes the server to terminate and the script creates an init.exe file in the root folder of the project.
 8. Rename file to udbmServer.exe and copy to the target destination.
 
 
Linux (Ubuntu):
 1. You need to have ruby and the UDBM Ruby binding installed on your machine (see folder RubyInstall in this project for more information)
 2. Open a terminal and switch to the root folder of this project.
 3. Run the command
 		ruby ./rubyscript2exe.rb ./udbmServer/init.rb
 4. Server reports to be running.
 5. Open Eclipse containing your Java development environment and go to the RubyUDBMBinding plugin.
 6. Run the JUnit test RubyClientShutdownTest.java located in the test/ package.
 7. This causes the server to terminate and the script creates an init_linux file in the root folder of the project.
 8. Rename file to udbmServer_linux and copy to the target destination.