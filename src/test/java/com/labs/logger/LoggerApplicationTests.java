package com.labs.logger;

import static org.assertj.core.api.Assertions.assertThat;

import com.labs.logger.component.Datasource;
import com.labs.logger.entities.WriteImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoggerApplicationTests {

	@Autowired
	WriteImpl writeImpl;

	@Autowired
	Datasource datasource;

	@Test
	public void contextLoads() {
		writeImpl.writeLog("My Log");
		assertThat(writeImpl).isNotNull();
	}

	@Test
	public void datasourceConfig() {
		datasource.setup();
		assertThat(datasource).isNotNull();

	}

}
