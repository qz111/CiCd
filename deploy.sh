#! /bin/sh

sudo docker login -u kloseqz -p 199102113411
echo "pull image from artifactory"
sudo docker pull kloseqz/cicdjenkins:v1.0
echo "docker run as server"
sudo docker run -p 8801:8080 -d --name mycicdjenkins kloseqz/cicdjenkins:v1.0