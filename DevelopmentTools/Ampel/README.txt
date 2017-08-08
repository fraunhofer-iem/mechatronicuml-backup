This is the /root folder of the Ampel Raspberry PI computer.
It uses the Raspbian distribution currently, but any other should work.

The /root/script file is executed at startup (the file "script" in this directory).
To archieve that, currently in the /etc/rc.local file we have the following contents:
#!/bin/sh -e
/root/script
exit 0

