package com.labs.logger;

import com.labs.logger.performancemonitor.FooAspect;
import com.labs.logger.services.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class ConfigBean {

  @Bean
  public Foo foo() {
    return new Foo();
  }

  @Bean
  public FooAspect fooAspect() {
    return new FooAspect();
  }
}
