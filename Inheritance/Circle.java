package Inheritance;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
        super();
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public String toString() {
        return "A circle with radius = " + this.radius + "which is a subclass of " + super.toString();
    }

}
