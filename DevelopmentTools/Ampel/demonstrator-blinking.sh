#!/bin/bash
i=0
j=0
while [ $j -le 37 ]; do
	#echo $i
	if [ $i -eq 1 ]; then
		echo 1 > /sys/class/gpio/gpio17/value  #rot
		echo 1 > /sys/class/gpio/gpio27/value  #gelb
		echo 0 > /sys/class/gpio/gpio22/value  #gruen
	elif [ $i -eq 2 ]; then
		echo 1 > /sys/class/gpio/gpio17/value  #rot
		echo 0 > /sys/class/gpio/gpio27/value  #gelb
		echo 1 > /sys/class/gpio/gpio22/value  #gruen
	elif [ $i -eq 3 ]; then
		echo 0 > /sys/class/gpio/gpio17/value  #rot
		echo 1 > /sys/class/gpio/gpio27/value  #gelb
		echo 1 > /sys/class/gpio/gpio22/value  #gruen
	else
		echo 1 > /sys/class/gpio/gpio17/value  #rot
		echo 1 > /sys/class/gpio/gpio27/value  #gelb
		echo 1 > /sys/class/gpio/gpio22/value  #gruen
	fi
	
	i=$(expr $i + 1)
	j=$(expr $j + 1)
	if [ $i -ge 4 ]; then
		i=0
	fi

	sleep 0.25
#	x=0
#	while [ $x -le $j ]; do
#		sleep 0.01
#		x=$(expr $x + 1)
#	done
done

i=0
j=0

while [ $i -le 2 ]; do
	if [ $i -eq 0 ]; then
		echo 0 > /sys/class/gpio/gpio17/value  #rot
		echo 0 > /sys/class/gpio/gpio27/value  #gelb
		echo 0 > /sys/class/gpio/gpio22/value  #gruen
	elif [ $i -eq 1 ]; then
		echo 0 > /sys/class/gpio/gpio17/value  #rot
		echo 0 > /sys/class/gpio/gpio27/value  #gelb
		echo 1 > /sys/class/gpio/gpio22/value  #gruen
	elif [ $i -eq 2 ]; then
		echo 0 > /sys/class/gpio/gpio17/value  #rot
		echo 1 > /sys/class/gpio/gpio27/value  #gelb
		echo 1 > /sys/class/gpio/gpio22/value  #gruen
	fi
	i=$(expr $i + 1)
	sleep 1
done

echo 1 > /sys/class/gpio/gpio17/value  #rot
echo 1 > /sys/class/gpio/gpio27/value  #gelb
echo 1 > /sys/class/gpio/gpio22/value  #gruen

