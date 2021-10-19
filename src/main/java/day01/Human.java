package day01;

public class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String introduction() {
        return "Hello, my name is " + this.name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}