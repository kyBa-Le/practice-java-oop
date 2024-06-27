package Java_Polymorphism;



public abstract class Auto {
    protected String carConstructor;
    protected double price;
    public Auto(){};
    public Auto(String carConstructor){
        this.carConstructor = carConstructor;
    }
    public String getCarConstructor(){
        return this.carConstructor;
    }

    public double getPrice(){
        return this.price;
    }

    public void setCarConstructor(String carConstructor){
        this.carConstructor = carConstructor;
    }
     
    public abstract  void setPrice();

    public String toString(){
        return "The car : " + this.carConstructor + ", price = " + this.price; 
    }

}
