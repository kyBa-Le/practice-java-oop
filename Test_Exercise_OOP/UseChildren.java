package Test_Exercise_OOP;

import java.util.Scanner;

abstract class Child{
    protected  char gender;
    protected  String name;
    protected  int age;
    public Child(){

    }
    public Child(String name, char gender){
        this.name = name;
        this.gender = gender;
    }

    public abstract void setAge(int age);
    public abstract void display();
}
class Male extends Child{
    public Male(){

    }

    public Male(String name){
        super(name, 'm');
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the age of " + this.name + " : ");
        this.setAge(input.nextInt());
    }
    @Override
    public void setAge(int age){
        super.age = age;
    }

    @Override
    public void display() {
       System.out.println("The boy's name is: " + this.name + ", the age = " + this.age); 
    }
}

class Female extends Child{
    public Female(){}

    public Female(String name){
        super(name, 'f');
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the age of " + this.name + " : ");
        this.setAge(input.nextInt());
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void display() {
        System.out.println("The girl's name is :" + this.name + ", the age = " + this.age);
    }

    
}
public class UseChildren {
    public static void main(String[] args) {
        Male child1 = new Male("Le Ky Ba");
        Female child2 = new Female("Ho Ly Kim Sa");
        child1.display();
        child2.display();
    }
}
