package me.kalpha.learningman;

public class Learningman {
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

    @Override
    public String toString() {
        return "Learningman{" +
                "howLong=" + howLong +
                ", name='" + name + '\'' +
                '}';
    }
}
