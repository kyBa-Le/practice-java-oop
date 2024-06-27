package Java_Polymorphism;

public abstract class Book {
    protected String title;
    protected double price;
    public Book(){}
    public Book(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    public double getPrice(){
        return this.price;
    }
    public abstract void setPrice();
}
