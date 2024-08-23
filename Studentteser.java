//Driver Class
import java.util.Scanner;
public class Studentteser {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Inputkan nama Siswa: ");
        String nama = input.nextLine();
        System.out.println("Inputkan ID Siswa: ");
        int id = input.nextInt();
        System.out.println("inputkan IPK Siswa: ");
        double ipk = input.nextDouble();

        Siswa Raihan = new Siswa( id, nama, ipk);
        input.close();
    //object
    //Class object = new Constructor
    Student nisa = new Student();
    Student ria = new Student();
    Student adi = new Student();
    Student angga = new Student();
    Student dion = new Student();

    nisa.name = "Anissa";
    ria.gpa = 90;

    System.out.println("Name: "+adi.name);
    System.out.println(nisa.name);
  }  
}
