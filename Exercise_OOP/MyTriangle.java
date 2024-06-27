package Exercise_OOP;

public class MyTriangle {
    private MyPoint v1 = new MyPoint(0, 0);
    private MyPoint v2 = v1;
    private MyPoint v3 = v1;

    public MyTriangle() {

    }

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public String toString() {
        String result = String.format("The Triangle @ (%d, %d), (%d, %d), (%d, %d)", v1.getX(), v1.getY(), v2.getX(),
                v2.getY(), v3.getX(), v3.getY());
        return result;
    }

    private double distance1 = v1.distance(v2);
    private double distance2 = v2.distance(v3);
    private double distance3 = v3.distance(v1);

    public double getPerimeter() {
        return (distance1 + distance2 + distance3);
    }

    public String printType() {
        if (distance1 != distance2 & distance2 != distance3 && distance3 != distance1) {
            return "Scalene";
        } else if (distance1 == distance2 && distance2 == distance3) {
            return "Equilateral";
        } else {
            return "Isosceles";
        }

    }
}
