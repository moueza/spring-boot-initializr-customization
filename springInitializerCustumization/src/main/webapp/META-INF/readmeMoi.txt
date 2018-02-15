https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-developing-web-applications.html


27.1.5 Static Content dc pas jsp qui sont dans  main/resources/templates
By default Spring Boot will serve static content from a directory called /static (or /public or /resources or /META-INF/resources) in the classpath or from the root of the ServletContext. It uses the ResourceHttpRequestHandler from Spring MVC so you can modify that behavior by adding your own 


27.1.8 Template engines


JSPs should be avoided if possible, there are several known limitations when using them with embedded servlet containers.

