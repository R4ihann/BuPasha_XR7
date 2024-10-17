package Exam1;
import java.util.Scanner;
public class DriverClass {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        Piano piano = new Piano();
        String instrmnts ="";
        double discount=0;
        double afterdisc=0;
        
        
        System.out.println("Would you like to pruchase a Guitar or a Piano?");
        instrmnts=i.nextLine();
        if (instrmnts.equalsIgnoreCase("Piano")) {

            System.out.println("Brand: ");
            piano.name = i.nextLine();
            System.out.println("Price: ");
            piano.price = i.nextDouble();
            System.out.println("Type of Piano: ");
            piano.pianotype=i.next();
            System.out.println("Insert a disount voucher ( if not Available insert 0): ");
            discount = i.nextDouble();
            afterdisc = piano.price-(piano.price*discount/100.0);
            piano.price=afterdisc;
            piano.print();
            }
            else if (instrmnts.equalsIgnoreCase("Guitar")) {
            Guitar g = new Guitar();
            System.out.println("Brand: ");
            g.name = i.nextLine();
            System.out.println("Price: ");
            g.price = i.nextDouble();
            System.out.println("Number of Strings: ");
            g.numStrings=i.nextInt();
            System.out.println("Electric or no?");
            g.isElectric = i.nextBoolean();
            System.out.println();
            System.out.println("Insert a disount voucher ( if not Available insert 0): ");
            discount = i.nextDouble();
            afterdisc = g.price-(g.price*discount/100.0);
            g.price=afterdisc;
            g.print();
        } 
        i.close();
    }
}
