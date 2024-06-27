package Test_Exercise_OOP;
import Inheritance.Square;
public class TestSquare {
    public static void main(String[] args) {
        Square sq1 = new Square(3, "red", true);
        sq1.setLength(4);
        System.out.println(sq1);
    }
}
