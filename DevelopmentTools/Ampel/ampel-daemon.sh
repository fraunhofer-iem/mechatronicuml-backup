#!/bin/sh
echo Starting ampel daemon...

cd /root

volume=7000

#initializing pins

init_pins() {
	init_pin 4 out
	init_pin 24 in
	cat /root/pins.conf | while read pin; do
		init_pin $pin out
	done
}

init_pin() {
	echo exporting pin $1
	echo $1 > /sys/class/gpio/unexport 2> /dev/null
	echo $1 > /sys/class/gpio/export
	echo $2 > /sys/class/gpio/gpio$1/direction
	echo 1 > /sys/class/gpio/gpio$1/value
}

request_job_state() {
	pim_status=`wget --tries=10 -O - "http://muml-build.cs.upb.de/view/PIM/api/xml?depth=1&tree=jobs[color]" 2> /dev/null`
	if [ $? -ne 0 ]; then
		return 0;
	fi

	all_status=`wget --tries=10 -O - "http://muml-build.cs.upb.de/view/All/api/xml?depth=1&tree=jobs[color]" 2> /dev/null`
	if [ $? -ne 0 ]; then
		return 0;
	fi
	
	# pim color
	pim=2
	echo $pim_status | grep yellow > /dev/null
        if [ $? -eq 0 ]; then
		pim=1
	fi
	echo $pim_status | grep red > /dev/null
        if [ $? -eq 0 ]; then
		pim=0
	fi

	# all color
	all=2
	echo $all_status | grep yellow > /dev/null
        if [ $? -eq 0 ]; then
		all=1
	fi
	echo $all_status | grep red > /dev/null
        if [ $? -eq 0 ]; then
		all=0
	fi

	# pim green
	if [ $pim -eq 2 ]; then
		if [ $all -eq 0 ]; then
			return 5 #red green
		fi
		if [ $all -eq 1 ]; then
			return 6 # yellow green
		fi
		return 7 # all green
	fi

	# pim yellow
	if [ $pim -eq 1 ]; then
		if [ $all -eq 0 ]; then
			return 3 # red_yellow
		fi
		return 4 # all yellow
	fi

	return 2 # failure
}

	set_pin() {
	echo "set pin $1 = $2"
	echo $2 > /sys/class/gpio/gpio$1/value
}


# arg1: number from 1 to 3 indicating state
set_pins() {

#	0) echo -n deactivated ;;
#		1) echo -n failure ;;
#		2) echo -n red ;;
#		3) echo -n red_yellow ;;
#		4) echo -n yellow ;;
#		5) echo -n red_green ;;
#		6) echo -n yellow_green ;;
#		7) echo -n green ;;
 #               *) echo -n unknown ;;


	num=1

	cat /root/pins.conf | while read pin; do
		on=0
		if [ $num -eq 1 ]; then
			if [ $1 -eq 2 ]; then
				on=1
			fi
			if [ $1 -eq 3 ]; then
				on=1
			fi
			if [ $1 -eq 5 ]; then
				on=1
			fi
		fi
		if [ $num -eq 2 ]; then
			if [ $1 -eq 3 ]; then
				on=1
			fi
			if [ $1 -eq 4 ]; then
				on=1
			fi
			if [ $1 -eq 6 ]; then
				on=1
			fi
		fi
		if [ $num -eq 3 ]; then
			if [ $1 -eq 5 ]; then
				on=1
			fi
			if [ $1 -eq 6 ]; then
				on=1
			fi
			if [ $1 -eq 7 ]; then
				on=1
			fi
		fi
		if [ $on -eq 1 ]; then
			set_pin $pin 0
                else
			set_pin $pin 1
                fi
                num=`expr $num + 1`
        done
}

output_state_name() {
	case "$1" in
		0) echo -n deactivated ;;
		2) echo -n red ;;
		3) echo -n red_yellow ;;
		4) echo -n yellow ;;
		5) echo -n red_green ;;
		6) echo -n yellow_green ;;
		7) echo -n green ;;
                *) echo -n unknown ;;
        esac
}

run() {
	init_pins; echo
	
	button_pid=-1
	button_state=0
	music=0
	oldstate=0
	while true; do
		if [ $button_state -eq 0 ]; then
			request_job_state
			state=$?
			if [ "$oldstate" -ne "$state" ]; then
				# print state change

				echo -n "transition from "
				output_state_name $oldstate
				echo -n " to "
				output_state_name $state
				echo

				set_pins $state

				if [ $oldstate -ne 0 ] && [ $state -ne 0 ]; then

        		                set_pin 4 0
					good=0
					if [ $oldstate -ne 0 ]; then
						if [ $state -gt $oldstate ]; then
							good=1
						fi
					fi
					if [ $oldstate -eq 0 ]; then
						if [ "$state" -ge "4" ]; then
							good=1
						fi
					fi
					if [ $good -eq 1 ]; then
						echo "play good.mp3";
						mpg123 -f $volume good.mp3 > /dev/null
					else
						echo "play bad.mp3";
						mpg123 -f $volume bad.mp3 > /dev/null
					fi
					set_pin 4 1
				fi

				oldstate="$state"
				echo
			fi
		fi
		for i in 1 2 3 4 5 6 7 8 9 10; do
			new_button_state=$(cat /sys/class/gpio/gpio24/value)
			if [ "0$new_button_state" -ne "0$button_state" ]; then
				if [ $new_button_state -eq 1 ]; then
					if [ $music -eq 0 ]; then
						music=1
						set_pin 4 0
						
						#mpc play
						/root/button.sh &
						button_pid=$!
						echo pressed

					else
						music=0
						pkill -P $button_pid 2> /dev/null
						kill $button_pid 2> /dev/null
						killall mpg123
						killall player
						button_pid=-1
#						mpc stop
						set_pin 4 1
						oldstate=0 #make sure we apply the right colors again
						echo released

					fi
				fi
				button_state=$new_button_state
			fi
			sleep 0.2
		done

		#echo test
	done
}

# start the run function
run
#!/bin/sh
echo Starting ampel daemon...

