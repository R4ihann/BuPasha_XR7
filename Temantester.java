public class Temantester {
    public static void main(String[] args) {
        Teman reno = new Teman();
        Teman reva = new Teman();
        Teman varo = new Teman();
        Teman tegar = new Teman();
        Teman naufal = new Teman();

        reno.name = "Moreno";
        reno.absen = 24;
        reno.ipk = 9.0;
        
        reva.name = "Zachreva";
        reva.absen = 9;
        reva.ipk = 9.4;

        varo.name = "Alvaro"; 
        varo.absen = 13;
        varo.ipk = 10.0;

        tegar.name = "Tegar";
        tegar.absen = 16;
        tegar.ipk = 9.5;

        naufal.name = "Naufal";
        naufal.absen = 28;
        naufal.ipk = 9.8;
    
        System.out.println("Nama: "+reno.name);
        System.out.println("Absen: "+reno.absen);
        System.out.println("Nilai: "+reno.ipk);
        System.out.println("Nama: "+reva.name);
        System.out.println("Absen: "+reva.absen);
        System.out.println("Nilai: "+reva.ipk);
        System.out.println("Name: "+varo.name);
        System.out.println("Absen: "+varo.absen);
        System.out.println("Nilai: "+varo.ipk);
        System.out.println("Nama: "+tegar.name);
        System.out.println("Absen: "+tegar.absen);
        System.out.println("Nilai: "+tegar.ipk);
        System.out.println("Nama: "+naufal.name);
        System.out.println("Absen: "+naufal.absen);
        System.out.println("Nilai: "+naufal.ipk);
        
    }
    
}
