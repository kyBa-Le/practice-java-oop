package Exercise_OOP;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public MyPolynomial(String filename) {
        Scanner in = null;
        try {
            in = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int degree = in.nextInt();
        in.nextLine();
        coeffs = new double[degree + 1];
        for (int i = 0; i < coeffs.length; i++) {
            coeffs[i] = in.nextDouble();
        }
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    public String toString() {
        double c3 = coeffs[coeffs.length - 1];
        int x3 = this.getDegree();
        double c2 = coeffs[coeffs.length - 2];
        int x2 = this.getDegree() - 1;
        double c1 = coeffs[1];
        double c0 = coeffs[0];
        return String.format("%1.1fx^%d + %1.1fx^%d + ... + %1.1fx^%d + %1.1fx^%d", c3, x3, c2, x2, c1, 1, c0, 0);
    }

    public double evaluate(double x) {
        double evalute = 0;
        for (int i = 0; i < coeffs.length; i++) {
            evalute += coeffs[i] * (Math.pow(x, i));
        }
        return evalute;
    }

    public MyPolynomial add(MyPolynomial another) {
        return null;
    }

    public MyPolynomial multiply(MyPolynomial another) {
        return null;
    }
}
// 1.7