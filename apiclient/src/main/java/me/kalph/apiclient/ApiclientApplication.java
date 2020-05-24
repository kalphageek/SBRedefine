package me.kalph.apiclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiclientApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(ApiclientApplication.class);
		//app.setWebApplicationType(WebApplicationType.NONE);
		app.run(args);
	}

}
