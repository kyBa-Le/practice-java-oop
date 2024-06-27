package Exercise_OOP;
// Exercise 1.3 the MyPoint class
public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint() {

    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        setX(x);
        setY(y);
    }

    public String toString() {
        return "x = " + x + ", y = " + y;
    }

    public double distance(int x, int y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    public double distance(MyPoint another) {
        return Math.sqrt((this.x - another.x) * (this.x - another.x) + (this.y - another.y) * (this.y - another.y));
    }

    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(1, 2);
        System.out.println(p1);
        MyPoint p2 = new MyPoint(3, 4);
        System.out.println(p2);
        System.out.printf("%1.3f", p1.distance(p2));
    }
}
