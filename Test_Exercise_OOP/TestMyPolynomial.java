package Test_Exercise_OOP;

import Exercise_OOP.MyPolynomial;

public class TestMyPolynomial {
    public static void main(String[] args) {
        String filename = "D:/For DA/testPolynomial.txt";
        MyPolynomial poly2 = new MyPolynomial(filename);
        System.out.println(poly2);
    }
}
