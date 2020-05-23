package me.kalpha.learningman;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("learningman")
public class LearningmanProperties {
    int howLong;
    String name;

    public int getHowLong() {
        return howLong;
    }

    public void setHowLong(int howLong) {
        this.howLong = howLong;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
