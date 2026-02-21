package tugas;

import java.time.LocalDate;

public class DosenMain23 {
    public static void main(String[] args) {
        Dosen23 dosenSatu = new Dosen23();
        dosenSatu.nama = "John Doe";
        dosenSatu.idDosen = "DS001";
        dosenSatu.statusAktif = true;
        dosenSatu.bidangKeahlian = "CTPS";
        dosenSatu.tahunBergabung = 2019;
        dosenSatu.masaKerja = dosenSatu.hitungMasaKerja(LocalDate.now().getYear());

        dosenSatu.setStatusAktif(false);
        dosenSatu.ubahKeahlian("Daspro");
        
        Dosen23 dosenDua = new Dosen23("DS002", "Jane Doe", false, 2020, "PBD");
        dosenDua.setStatusAktif(true);
        dosenDua.ubahKeahlian("PASD");
        
        System.out.println("=".repeat(25));
        dosenSatu.tampilInformasi();
        System.out.println("-".repeat(25));
        dosenDua.tampilInformasi();
    }
}
