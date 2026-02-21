package tugas;

public class MataKuliah23 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah23(){}
    
    public MataKuliah23(String kodeMK, String nama, int sks, int jumlahJam){
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilInformasi(){
        System.out.printf("%-15s: %s\n", "Mata Kuliah", nama);
        System.out.printf("%-15s: %s\n", "Kode Matkul", kodeMK);
        System.out.printf("%-15s: %d\n", "SKS", sks);
        System.out.printf("%-15s: %d\n", "Jumlah Jam", jumlahJam);
    }
    
    void ubahSKS(int sksBaru){
        sks = sksBaru;
    }
    
    void tambahJam(int jam){
        jumlahJam += jam;
    }
    
    void kurangiJam(int jam){
        jumlahJam -= jam;
    }
}
