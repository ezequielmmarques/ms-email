# Getting Started

#### Resume:
- Microservice for send email. 

### Reference Documentation

For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.5/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.5/gradle-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.5/reference/htmlsingle/#web)
* [Java Mail Sender](https://docs.spring.io/spring-boot/docs/2.7.5/reference/htmlsingle/#io.email)
* [Validation](https://docs.spring.io/spring-boot/docs/2.7.5/reference/htmlsingle/#io.validation)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.7.5/reference/htmlsingle/#data.sql.jpa-and-spring-data)

### Guides

The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Validation](https://spring.io/guides/gs/validating-form-input/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

### Additional Links

These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

### For test in the Postman:

#### Request:
`{
    "ownerRef": "Ezequiel",
    "emailFrom": "mail@gmail.com",
    "emailTo": "mail@gmail.com",
    "subject": "Segunda Envio - 2ª Edição - Code Dev",
    "text": "Uma arquitetura de microsserviço – uma variante do estilo estrutural SOA – é um padrão de arquitetura que organiza um aplicativo como uma coleção de serviços de baixa granularidade e pouco acoplados, comunicando-se por meio de protocolos leves."
}`

### Settings Mensageria:
* [CloudAMQP](https://api.cloudamqp.com/console/1a56d4c0-3ae4-49f2-812d-e2904ce2c585/details)