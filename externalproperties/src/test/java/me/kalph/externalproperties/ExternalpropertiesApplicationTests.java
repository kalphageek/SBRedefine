package me.kalph.externalproperties;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;

import static org.assertj.core.api.Assertions.assertThat;

@TestPropertySource(locations = "classpath:/test.properties")
@SpringBootTest
class ExternalpropertiesApplicationTests {

	@Autowired
	Environment environment;

	@Test
	void contextLoads() {
		assertThat(environment.getProperty("kalpha.name"))
				.isEqualTo("test");
		assertThat(environment.getProperty("kalpha.hi-name"))
				.isEqualTo("hi-test");
		assertThat(environment.getProperty("kalpha.age"))
				.isEqualTo("10");


	}

}
