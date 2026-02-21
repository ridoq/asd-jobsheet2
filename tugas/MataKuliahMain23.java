package tugas;

public class MataKuliahMain23 {
    public static void main(String[] args) {
        MataKuliah23 matkulSatu = new MataKuliah23();
        matkulSatu.nama = "Critical Thinking and Problem Solving";
        matkulSatu.kodeMK = "MK01";
        matkulSatu.sks = 2;
        matkulSatu.jumlahJam = 2;
        
        matkulSatu.ubahSKS(3);
        matkulSatu.tambahJam(5);
        matkulSatu.kurangiJam(1);
        
        MataKuliah23 matkulDua = new MataKuliah23("Algoritma dan Struktur Data", "MK02", 3, 6);
        matkulDua.ubahSKS(2);
        matkulDua.tambahJam(4);
        matkulDua.kurangiJam(6);
        
        System.out.println("=".repeat(50));
        matkulSatu.tampilInformasi();
        System.out.println("-".repeat(50));
        matkulDua.tampilInformasi();
    }
}
