package Test_Exercise_OOP;

import Exercise_OOP.MyPoint;

public class CheckPoin{
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(1,2);
        MyPoint point2 = new MyPoint(3,4);
        System.out.println(point1.distance(point2));
    }
}
