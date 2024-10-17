package Exam1;

public class Piano extends Instruments {
    String pianotype;

    public Piano(){
        price=0;
        name="";
        pianotype="";
    }

    public Piano(double price, String name, String pianotype){
        super(price,name);
        this.pianotype=pianotype;
    }
    @Override
    public void print(){
        System.out.println("Price: "+"$"+price);
        System.out.println("Name: "+ name);
        System.out.println("Piano Type: "+pianotype);
    }

}
