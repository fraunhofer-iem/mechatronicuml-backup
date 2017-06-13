In order to build this image, you first have to place the dds license file into this folder and name it rti_license.dat.

Then run 

`
docker build -t dds .
`

Afterwards, you'll be able to build the docker images for the broker, the production station and the generator.
