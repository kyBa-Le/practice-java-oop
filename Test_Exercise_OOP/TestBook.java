package Test_Exercise_OOP;

import Exercise_OOP.Author;
import Exercise_OOP.Book;

public class TestBook {

    public static int getSumArr(Object[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                break;
            }
            sum++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Author author1 = new Author("Le Ky Ba", "Bale@gmail.com", 'm');
        Book[] bookJava = new Book[1000];
        Book[] bookPython = new Book[1000];
        for (int i = 0; i < 120; i++) {
            bookJava[i] = new Book();
        }
        for (int i = 0; i < 200; i++) {
            bookPython[i] = new Book();
        }
        System.out.println(Book.getQtyInStock());
        System.out.println(getSumArr(bookJava));
        System.out.println();
    }
}
