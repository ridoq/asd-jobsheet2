public class MahasiswaMain23 {
    public static void main(String[] args) {
        Mahasiswa23 mhs1 = new Mahasiswa23();
        mhs1.nama = "John Doe";
        mhs1.nim = "25410000002";
        mhs1.kelas = "SIB 1X";
        mhs1.ipk = 3.99;
        
        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SIB 1Z");
        mhs1.updateIpk(4.0);
        mhs1.tampilkanInformasi();

        Mahasiswa23 mhs2 = new Mahasiswa23("Jane Doe", "254100000002", 3.99, "SIB 1Z");
        mhs2.updateIpk(4.00);
        mhs2.tampilkanInformasi();

        Mahasiswa23 mhsRidok = new Mahasiswa23("Taufiqi Ridho Maulana", "254107060058", 3.5, "SIB 1Z");
        mhsRidok.updateIpk(3.6);
        mhsRidok.ubahKelas("SIB 1F");
        mhsRidok.tampilkanInformasi();
    }
}