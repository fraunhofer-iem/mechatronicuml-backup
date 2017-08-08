#!/bin/sh
init_pin() {
    echo exporting pin $1
    echo $1 > /sys/class/gpio/unexport 2> /dev/null
    echo $1 > /sys/class/gpio/export
    echo $2 > /sys/class/gpio/gpio$1/direction
    echo 1 > /sys/class/gpio/gpio$1/value
}


set_pin() {
    echo "set pin $1 = $2"
    echo $2 > /sys/class/gpio/gpio$1/value
}


# relais fuer sound einschalten
init_pin 4 out

# button als eingang
init_pin 24 in

# drei farben als ausgabe machen
init_pin 17 out
init_pin 27 out
init_pin 22 out

echo > /root/current-status #prevent relaunch
echo 0 > /sys/class/gpio/gpio17/value  #rot
echo 1 > /sys/class/gpio/gpio27/value  #gelb
echo 1 > /sys/class/gpio/gpio22/value  #gruen

/root/demonstrator-button-listener.sh &

/root/appPILaunch
