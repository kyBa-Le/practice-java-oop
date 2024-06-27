package Java_Polymorphism;

public class Chevy extends Auto{
    public Chevy(){

    }

    public Chevy(String carConstructor) {
        super(carConstructor);
        this.setPrice();
    }
    @Override
    public void setPrice(){
        this.price = 22000;
    }

}
