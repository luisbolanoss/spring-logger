package com.labs.logger.configuration;

import com.labs.logger.aspect.FooAspect;
import com.labs.logger.entities.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class FooConfiguration {

  @Bean
  public Foo foo() {
    return new Foo();
  }

  @Bean
  public FooAspect fooAspect() {
    return new FooAspect();
  }
}
