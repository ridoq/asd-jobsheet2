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
    }
}