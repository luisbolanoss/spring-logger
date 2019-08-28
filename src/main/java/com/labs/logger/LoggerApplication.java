package com.labs.logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
// @Configuration tags the class as a source of bean definitions for the application context
// @EnableAutoConfiguration tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings. For example, if spring-webmvc is on the classpath this flags the application as a web application and activates key behaviors such as setting up a DispatcherServlet.
// @ComponentScan tells Spring to look for other components, configurations, and services in the hello package, allowing it to find the controllers.
public class LoggerApplication {
  public static void main(String[] args) {
    SpringApplication.run(LoggerApplication.class, args);
  }

}
