package Java_Polymorphism;

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}
public class BookArray{
    public static void main(String[] args) {
        Book [] bookArray = new Book[10];
        for(int i = 0;i < 5; i++){
            bookArray[i] = new Fiction();
        }
        for(int i = 5; i<10; i++){
            bookArray[i] = new NonFiction();
        }
        for(int i = 0; i<10; i++){
            System.out.println(bookArray[i].getClass());
        }
    }
}
