package Java_Polymorphism;

public abstract class CardGame {
    protected Card[] deck = new Card[52];
    protected int numberOfCard;
    public CardGame(){
        
    }
    public void Shuffle(){

    }
    public abstract void briefDescription();
    public abstract void deal();
}
class Card{
    String suit;
    String value;
    
    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }
    public String toString(){
        return this.suit + this.value;
    }
}

