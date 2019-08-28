package com.labs.logger.component;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevDatasourceImpl implements Datasource {
  public void setup() {
    System.out.println("Setting up datasource for DEV environment. ");
  }
}
