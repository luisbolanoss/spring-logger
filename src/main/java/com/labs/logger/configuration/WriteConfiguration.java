package com.labs.logger.configuration;

import com.labs.logger.entities.Write;
import com.labs.logger.entities.WriteImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

@Configuration
public class WriteConfiguration {
  @Autowired
  private Environment environment;

  @Bean
  @Profile("test")
  Write getWriterTest()
  {
    String profile = this.getProfile();
    Write write = new WriteImpl(profile);
    write.writeLog("should be Test");
    return write;
  }

  @Bean
  @Profile("dev")
  Write getWriterDefault()
  {
    String profile = this.getProfile();
    Write write = new WriteImpl(profile);
    write.writeLog("should be Dev");

    return write;
  }

  @Bean
  @Profile("prod")
  Write getWriterOther()
  {
    String profile = this.getProfile();
    Write write = new WriteImpl(profile);
    write.writeLog("should be Dev");
    return write;
  }

  String getProfile()
  {
    if (environment.getActiveProfiles() == null)
      return "default";

    String[] profiles = environment.getActiveProfiles();

    return profiles.length > 0 ? profiles[0] : "default";
  }
}
