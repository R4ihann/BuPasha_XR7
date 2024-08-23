//object class
import java.util.Scanner;
public class Karyawantester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inputkan nama Siswa: ");
        String nama = input.nextLine();
        System.out.println("Inputkan ID Siswa: ");
        int id = input.nextInt();
        System.out.println("inputkan IPK Siswa: ");
        double ipk = input.nextDouble();

        Siswa nimas = new Siswa(id, nama, ipk);
        nimas.print();
        input.close();

        // object
        // Class object = new Construction
        Karyawan Willy = new Karyawan(35,"Willy","TU","Madura");
        Karyawan Varo = new Karyawan(13,"Varo","Kesiswaan","Sidoarjo");
        Karyawan Evan = new Karyawan(10,"Evan","TU","Malang");
        Karyawan Gilam = new Karyawan(19,"Gilam","Kesiswaan","Papua");
        Karyawan Arjuna = new Karyawan(1,"Arjuna","Kurikulum","Mataram");

        Willy.print();
        System.out.println();
        Varo.print();
        System.out.println();
        Evan.print();
        System.out.println();
        Gilam.print();
        System.out.println();
        Arjuna.print();
    }
}