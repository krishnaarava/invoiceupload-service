# Authentication with Spring Boot, AngularJS and Keycloak

- Make sure to follow the below steps with Keycloak (keycloak-2.3.0.Final) before using the application

1) Execute bin/standalone.sh

2) Open http://localhost:8080/auth to create admin user

3) Open Admin Console - http://localhost:8080/auth/admin/

4) import keycloak/demo-realm.json into 

## Run with standalone Tomcat

To run the project with embedded Tomcat by maven:

    mvn spring-boot:run
  
Then navigate to [http://localhost:8000](http://localhost:8000) to see the application in action.
