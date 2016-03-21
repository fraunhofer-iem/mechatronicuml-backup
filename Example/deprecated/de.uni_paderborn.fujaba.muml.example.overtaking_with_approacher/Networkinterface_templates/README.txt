Network has the following structure:

WiFi-Rounter 
	Config: 192.168.0.1 /24
	Security: Disabled
	SSID: "IPT_EM_DEMO"
	Mode: bgn
	DHCP: Disabled

Message-Server 
	Config: 192.168.0.101/24
	PORT: 9999
	Firewall: Add exception or deactivate

Server-Brick (a.k.a Section-Control)
	Config: 192.168.0.102 /24
	Target: 192.168.0.1:9999

Approacher_R2
	Config: 192.168.0.103 /24
	Target: 192.168.0.1:9999
	
Overtakee_R2
	Config: 192.168.0.104 /24
	Target: 192.168.0.1:9999	
	BT-Role: Master
	BT-Key: "CYBERTRON" 
	
Overtaker_R2
	Config: 192.168.0.105 /24
	Target: 192.168.0.1:9999	
	BT-Role: Slave
	BT-Key: "CYBERTRON" 
	
(Note: It's always the second [R2] brick which does the communication)