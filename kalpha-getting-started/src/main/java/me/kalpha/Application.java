package me.kalpha;

import me.kalpha.learningman.Learningman;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        //application.properties 의 spring.main.web-application-type=none 로 대체
        //app.setWebApplicationType(WebApplicationType.NONE);
        app.run(args);
    }

//    @Bean
//    public Learningman learningman() {
//        Learningman learningman = new Learningman();
//        learningman.setHowLong(10);
//        learningman.setName("Learning Man");
//        return learningman;
//    }
}
