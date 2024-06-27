package Java_Polymorphism;

public class NonFiction extends Book{
    public NonFiction(){}
    public NonFiction(String title){
        super(title);
        this.setPrice();
    }
    @Override
    public void setPrice(){
        this.price = 37.99;
    }
}
