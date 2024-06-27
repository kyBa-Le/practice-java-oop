package Test_Exercise_OOP;
import Java_Polymorphism.Shape;
import Java_Polymorphism.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "red", false);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        System.out.println(s1.getClass());
        Circle s2 = (Circle) s1;
        System.out.println(s2); 
        System.out.println(s2.getClass());
        System.out.println(s2.getRadius());
        // System.out.println(s1.getRadius());
    
    }
}
