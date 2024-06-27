package Test_Exercise_OOP;

import Exercise_OOP.MyComplex;
import java.util.Scanner;

public class TestMyComplex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter complex number 1 (real and imaginary part): ");
        MyComplex complex1 = new MyComplex(input.nextDouble(), input.nextDouble());
        System.out.println("Enter complex number 2 (real and imaginary part): ");
        MyComplex complex2 = new MyComplex(input.nextDouble(), input.nextDouble());
        System.out.println("Number 1 is: " + complex1);
        String resultCheck = "";
        if (complex1.isReal() == false) {
            resultCheck = " NOT";
        }
        System.out.printf(complex1 + "is%s a pure real number\n", resultCheck);
        if (complex1.isImag() == false) {
            resultCheck = " NOT";
        }
        System.out.printf(complex1 + "is%s a pure imaginary number\n", resultCheck);
        System.out.println("Number 2 is: " + complex2);
        if (complex2.isReal() == false) {
            resultCheck = " NOT";
        }
        System.out.printf(complex2 + "is%s a pure real number \n", resultCheck);
        if (complex2.isImag() == false) {
            resultCheck = " NOT";
        }
        System.out.printf(complex2 + "is%s a imaginary number\n", resultCheck);
        if (complex1.equals(complex2) == false) {
            resultCheck = " NOT";
        }
        System.out.printf(complex1 + "is%s equal to " + complex2, resultCheck);

    }
}
