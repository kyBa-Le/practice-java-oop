package Exercise_OOP;

public class Book {
    private String name;
    private Author author;
    private double price;
    private static int qtyInStock = 0;

    public Book() {
        int qtyInStock = 1;
        this.qtyInStock++;
    }

    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock++;
    }

    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock += qtyInStock;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    public String getAythorName() {
        return author.getName();
    }

    public String getAuthorName() {
        return this.getAuthor().getName();
    }

    public String toString() {
        return "Book's name: " + this.name + ",[Author: " + this.author + "], price: " + this.price + ", qtyInStock: "
                + this.qtyInStock;
    }

    public void main(String[] args) {

    }
}
// I have changed this work so I think it is wrong now.
