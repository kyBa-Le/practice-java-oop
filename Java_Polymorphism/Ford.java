package Java_Polymorphism;

public class Ford extends Auto{
    public Ford(){

    }
    public Ford(String carConstructor){
        super(carConstructor);
        this.setPrice();

    }
    @Override
    public void setPrice(){
        this.price = 20000;
    }
}
