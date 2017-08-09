# spring_boot_web_token

This is a sample Java / Gradle / Spring Boot application. A very simple example of how use spring boot rest api with web token security

## How to Run

This application is packaged as a war which has Tomcat 7 embedded. No Tomcat installation is necessary.

Following few commands that should get you up and running:

./gradlew build will build the java code and create all necessary source files
./gradle bootRun will build the project and also start the application at the port 8080. 

## About the application


### Get information about system health, configurations, etc.

http://localhost:8091/env
http://localhost:8091/health
http://localhost:8091/info
http://localhost:8091/metrics

### Create a user resource

Post

http://localhost:8080/user/register

header

Content-Type application/json

payload

{
  "firstName": "abraham",
  "email": "test@gmail.com",
  "password": "uno"
}

### LogIn and get the token

Post

http://localhost:8080/user/login

header

Content-Type application/json

payload

{
  "email": "test@gmail.com",
  "password": "uno"
}
