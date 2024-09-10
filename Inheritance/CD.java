package Inheritance;

public class CD extends Product {
    String artist;
    int totalSong;
    String label;

    public CD(){
        number = 2;
        name="Perayaan Patah Hati";
        quantity=1;
        price=35000;
        artist="For Revenge";
        totalSong=8;
        label="Sony Music";
    }

    public void CDprint(){
        System.out.println("Name: "+name);
        System.out.println("Artist: "+artist);
        System.out.println("Songs: "+totalSong);
        System.out.println("Label"+label);
        System.out.println("Price: "+price);
        System.out.println("Quantity: "+quantity);
        System.out.println("Number: "+number);
    }
        
    

}
