package me.kalph.externalproperties.runner;

import me.kalph.externalproperties.properties.JjdProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {
    @Value("${kalpha.name}")
    String name;
    @Value("${kalpha.age}")
    int age;
    @Value("${kalpha.random}")
    int random;
    @Value("${kalpha.hi-name}")
    String hiName;

    @Autowired
    JjdProperties jjdProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("==================");
        System.out.println(name);
        System.out.println(age);
        System.out.println(random);
        System.out.println(hiName);
        System.out.println("==================");

        System.out.println("==================");
        System.out.println(jjdProperties.getName());
        System.out.println(jjdProperties.getAge());
        System.out.println(jjdProperties.getRandom());
        System.out.println(jjdProperties.getSessionTimeout());
        System.out.println("==================");
    }
}
