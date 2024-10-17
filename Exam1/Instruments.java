package Exam1;

public class Instruments {
    protected double price=0;
    protected String name="";

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instruments(){
        price=0;
        name="";
    }

    public Instruments(double price, String name){
        this.price=price;
        this.name=name;
    }

    public void print(){
        System.out.println("Price: "+price);
        System.out.println("Name: "+name);
    }
}
