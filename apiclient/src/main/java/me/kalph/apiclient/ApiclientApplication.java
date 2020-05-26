package me.kalph.apiclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.elasticsearch.rest.RestClientBuilderCustomizer;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.client.RestTemplateCustomizer;
import org.springframework.boot.web.reactive.function.client.WebClientCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class ApiclientApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(ApiclientApplication.class);
		//app.setWebApplicationType(WebApplicationType.NONE);
		app.run(args);
	}

	@Bean
	public WebClientCustomizer webClientCustomizer() {
		return new WebClientCustomizer() {
			@Override
			public void customize(WebClient.Builder webClientBuilder) {
				webClientBuilder.baseUrl("http://localhost:8080");
			}
		};
	}
}
