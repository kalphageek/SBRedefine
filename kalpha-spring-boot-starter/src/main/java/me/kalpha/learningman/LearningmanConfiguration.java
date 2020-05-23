package me.kalpha.learningman;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(LearningmanProperties.class)
public class LearningmanConfiguration {
    @Bean
    @ConditionalOnMissingBean
    Learningman learningman(LearningmanProperties prop) {
        Learningman learningman = new Learningman();
        learningman.setHowLong(prop.getHowLong());
        learningman.setName(prop.getName());
        return learningman;
    }

}
