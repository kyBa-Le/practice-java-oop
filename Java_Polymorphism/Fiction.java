package Java_Polymorphism;

public class Fiction extends Book{
    public Fiction(){}   
    public Fiction(String title){
        super(title);
        this.setPrice();

    } 
    @Override
    public void setPrice(){
        this.price = 24.99;
    }
}
