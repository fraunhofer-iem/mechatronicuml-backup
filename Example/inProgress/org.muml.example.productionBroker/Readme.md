Install Docker-CE 
	https://docs.docker.com/engine/installation/linux/docker-ce/ubuntu
Install python3-pip
	sudo apt-get install python3-pip
Install Docker-Compose
	sudo pip3 install docker-compose
Copy srv
	scp -r username@virtual-factory-iem-fraunhofer.cs.upb.de:/srv /
Change to Folder
	cd /srv
Login to Hub
	sudo docker-compose login ...

To Build sudo docker-compose build dds

To update

	sudo docker-compose pull broker-db-service

To start terminal

	sudo docker-compose exec broker sh

To Run
	sudo docker-compose up -d
                                                                                 
To scale

	sudo docker-compose scale productionstation=<number>

To stop

	sudo docker-compose down

To open logs

	sudo docker-compose logs broker

Process overview
	
	sudo docker-compose ps


To cleanup volumes after the production broker has been started
	sudo docker volume prune
To cleanup images after the production broker has been started
	sudo docker rmi $(sudo docker images -a -q)
To cleanup everything, including containers and volumens
	sudo docker system prune
  
 
show free disc space
	df
Nifty little tool for SSH-Session management: byobu
Start byobu at login using byobu-config
F2: New window
F3,F4: Change window

For integration test:
    Copy docker-compose-integration-test.yml into srv
        cp org.muml.example.productionBroker/docker-compose-integration-test.yml .
    Build the integration test:
        sudo docker-compose -f docker-compose-integration-test.yml build
    Start the test:
        sudo docker-compose -f docker-compose-integration-test.yml up
    Hint: The web service will continue after the test ist done.
    Stop it with Ctrl+C
    
    

                                      
