package tugas;

import java.time.LocalDate;

public class Dosen23 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;
    int masaKerja;

    public Dosen23(){}

    public Dosen23(String id, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian){
        idDosen = id;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
        masaKerja = hitungMasaKerja(LocalDate.now().getYear());
    }

    void tampilInformasi(){
        System.out.printf("%-18s: %s\n", "Nama", nama);
        System.out.printf("%-18s: %s\n", "ID", idDosen);
        System.out.printf("%-18s: %b\n", "Status Aktif", statusAktif);
        System.out.printf("%-18s: %s\n", "Bidang Keahlian", bidangKeahlian);
        System.out.printf("%-18s: %d\n", "Tahun Bergabung", tahunBergabung);
        System.out.printf("%-18s: %d\n", "Masa Kerja", masaKerja);
    }
    
    void setStatusAktif(boolean status){
        statusAktif = status;
    }
    
    void ubahKeahlian(String bidang){
        bidangKeahlian = bidang;
    }
    
    int hitungMasaKerja(int thnSkrg){
        return thnSkrg - tahunBergabung;
    }
}
