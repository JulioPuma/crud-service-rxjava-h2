#  Base Project for Spring

Project used like template for other projects.

* Language: Java 17 
* Framework: SpringBoot 3
* Dependency management: Maven 3.6.3

<img src="./src/main/resources/images/markdown/java17-logo.png" alt="logo" style="height: 50px; width:100px;"/>
<img src="./src/main/resources/images/markdown/springboot.png" alt="logo" style="height: 50px; width:100px;"/>
<img src="./src/main/resources/images/markdown/reactiveX.png" alt="logo" style="height: 50px; width:100px; background-color:white" />

## Dependencies

- spring-boot-starter-web
- lombok
- RxJava3

## Package

- controllers: Used to define endpoints.
- service: Used to process logic bussines.
- repository: Used to connect with relational databases .
- proxy.client: Implements Classes to connect with other REST Services.
- config: Used to configure the project behaviour. 
- model: Used to create simples object like POJOs, DTOs. 