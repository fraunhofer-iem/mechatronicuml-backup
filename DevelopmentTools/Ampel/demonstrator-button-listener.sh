#!/bin/sh
while [ true ]; do
	state=$(cat /sys/class/gpio/gpio24/value)
	if [ $state -eq 1 ]; then
		grep green /root/current-status
		if [ $? -eq 0 ]; then
			echo 0 > /sys/class/gpio/gpio4/value
			/root/demonstrator-blinking.sh &
			mpg123 /root/rocket.mp3 > /dev/null
			killall demonstrator-blinking.sh

			echo > /root/current-status #prevent relaunch
			echo 0 > /sys/class/gpio/gpio17/value  #rot
			echo 1 > /sys/class/gpio/gpio27/value  #gelb
			echo 1 > /sys/class/gpio/gpio22/value  #gruen


		fi
	fi
	
	echo 1 > /sys/class/gpio/gpio4/value
	
done
