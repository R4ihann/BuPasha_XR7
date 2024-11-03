import Inheritance.CD;
import Inheritance.DVD;
import Inheritance.Product;

public class tugasArray {
    public static void main(String[] args) {
         Product[] produk = new Product[10];
        CD[] c = new CD[5];
        DVD[] d = new DVD[5];
        System.out.println("Prod[0]: ");
        produk[0]=new Product();
        produk[0].print();
        System.out.println("CD[4]: ");
        c[4] = new CD(3,"Talking to the moon ",12,200,"Bruno Mars",10,"Sony");
        c[4].print();
        System.out.println("DVD[3]: ");
        d[3]= new DVD("Best Friend - ROC",2,7,40.5,"16+","Sony Entertainment",4);
        d[3].print();
        System.out.println("Prod[1]: ");
        produk[1]=new Product(1,"Dokkae", 2,20.5);
        produk[1].print();
        
    }
}
