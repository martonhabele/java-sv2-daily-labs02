package day02;

public class Geometry {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(2f, 3f);

        System.out.println("This will calculate a 2×3 block-sized rectangle's area:");

        System.out.println(rectangle.calculateArea());
    }
}
