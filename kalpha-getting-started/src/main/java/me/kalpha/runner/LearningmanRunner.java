package me.kalpha.runner;

import me.kalpha.learningman.Learningman;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class LearningmanRunner implements ApplicationRunner {
    @Autowired
    Learningman learningman;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(learningman);
    }
}
