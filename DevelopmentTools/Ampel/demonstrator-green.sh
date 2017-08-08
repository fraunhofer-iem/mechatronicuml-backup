#!/bin/sh
echo 1 > /sys/class/gpio/gpio17/value  #rot
echo 1 > /sys/class/gpio/gpio27/value  #gelb
echo 0 > /sys/class/gpio/gpio22/value  #gruen


echo green > /root/current-status
