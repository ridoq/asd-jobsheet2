public class MahasiswaMain23 {
    public static void main(String[] args) {
        Mahasiswa23 mhs1 = new Mahasiswa23();
        mhs1.nama = "Taufiqi Ridho Maulana";
        mhs1.nim = "254107060058";
        mhs1.kelas = "SIB 1F";
        mhs1.ipk = 3.5;
        
        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SIB 1Z");
        mhs1.updateIpk(3.6);
        mhs1.tampilkanInformasi();

        Mahasiswa23 mhs2 = new Mahasiswa23("Jane Doe", "254100000001", 3.99, "SIB 1F");
        mhs2.updateIpk(4.00);
        mhs2.tampilkanInformasi();
    }
}