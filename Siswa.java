//object class
public class Siswa {
    int id;
    String nama;
    double ipk;

    //Constructor
    //nama harus sama dengan Class
    public Siswa(){
        id = 0;
        nama = "kosong";
        ipk = 0.0;
    }
    
    //Constructor Parameter
    public Siswa(int id, String nama, double ipk) {
        //variabel = parameter
        this.id = id;
        this.nama = nama;
        this.ipk = ipk;
    }
}
