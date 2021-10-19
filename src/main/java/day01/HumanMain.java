package day01;

public class HumanMain {
    public static void main(String[] args) {
        Human human = new Human("Bill", 12);

        Human human1 = new Human("Jill", 30);

        System.out.println(human.introduction());

        System.out.println(human1.introduction());
    }

}
