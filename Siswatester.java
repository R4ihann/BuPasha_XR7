//object class
public class Siswatester {
    public static void main(String[] args) {
        // object
        // Class object = new Construction
        Siswa Evan = new Siswa(10,"Evan",95);
        Siswa Arjuna = new Siswa(1,"Arjuna",95);
        Siswa Varo = new Siswa(13,"Varo",95);
        Siswa Gilam = new Siswa(19,"Gilam",95);
        Siswa Willy = new Siswa(35,"Willy",95);

        System.out.println("ID : " + Evan.id);
        System.out.println("Nama : " + Evan.nama);
        System.out.println("IPK : " + Evan.ipk);
        System.out.println("    ");
        System.out.println("ID : " + Arjuna.id);
        System.out.println("Nama : " + Arjuna.nama);
        System.out.println("IPK : " + Arjuna.ipk);
        System.out.println("    ");
        System.out.println("ID : " + Varo.id);
        System.out.println("Nama : " + Varo.nama);
        System.out.println("IPK : " + Varo.ipk);
        System.out.println("    ");
        System.out.println("ID : " + Gilam.id);
        System.out.println("Nama : " + Gilam.nama);
        System.out.println("IPK : " + Gilam.ipk);
        System.out.println("    ");
        System.out.println("ID : " + Willy.id);
        System.out.println("Nama : " + Willy.nama);
        System.out.println("IPK : " + Willy.ipk);
    }
}