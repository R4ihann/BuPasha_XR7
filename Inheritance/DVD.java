package Inheritance;

public class DVD extends Product{
    private int length;
    private String rating;
    private String studio;

    public DVD(){
        number=1;
        name="For Revenge";
        quantity=2;
        price=14.3;
        length=4;
        rating="NC-13";
        studio="Sony Entertainment";
    }

    public void DVDprint(){

        System.out.println("Name: "+name);
        System.out.println("Studio: "+studio);
        System.out.println("Rating: "+rating);
        System.out.println("Price: "+price);
        System.out.println("length: "+length);
        System.out.println("Quantity: "+quantity);
        System.out.println("Number: "+number);
    }

}
