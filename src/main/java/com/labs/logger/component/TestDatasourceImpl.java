package com.labs.logger.component;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("test")
public class TestDatasourceImpl implements Datasource {
  public void setup() {
    System.out.println("Setting up datasource for Test environment. ");
  }
}
