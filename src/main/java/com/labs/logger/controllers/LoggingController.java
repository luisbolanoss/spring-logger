package com.labs.logger.controllers;

import com.labs.logger.services.Foo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {
  @Autowired
  private Foo foo;

  private Logger logger = LoggerFactory.getLogger(LoggingController.class);

  @RequestMapping("/")
  public String index() {
//    logger.trace("A TRACE Message");
//    logger.debug("A DEBUG Message");
//    logger.info("An INFO Message");
//    logger.warn("A WARN Message");
//    logger.error("An ERROR Message");

    foo.bar();

    return "Howdy! Check out the Logs to see the output...";
  }
}
