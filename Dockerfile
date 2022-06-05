FROM adoptopenjdk/openjdk11:alpine-jre
#Specific instance of Alphin Linux OS being used
MAINTAINER mastercard.com
#Helpful if you push your image to Docker hub
#EXPOSE 9991
ADD target/my-docker-demo.jar spring-boot-docker.jar
ENTRYPOINT ["java","-jar","spring-boot-docker.jar"]
#Specifies an order, what needs to be invoked for the central application
