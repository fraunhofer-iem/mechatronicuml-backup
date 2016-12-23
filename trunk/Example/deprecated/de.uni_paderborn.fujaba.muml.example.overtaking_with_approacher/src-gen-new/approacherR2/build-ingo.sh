#!/bin/sh
ssh xubuntu@192.168.56.102 "export DISPLAY=:0; cd /home/xubuntu/Desktop/nxtOSEK/src-gen-new/approacherR2; make all && ./appflash.sh"
