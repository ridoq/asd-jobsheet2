#   Percobaan 1

##  Soal

1.  Sebutkan dua karakteristik class atau object!
2.	Perhatikan class Mahasiswa pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class Mahasiswa? Sebutkan apa saja atributnya!
3.	Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!
4.	Perhatikan method updateIpk() yang terdapat di dalam class Mahasiswa. Modifikasi isi method tersebut sehingga IPK yang dimasukkan valid yaitu terlebih dahulu dilakukan pengecekan apakah IPK yang dimasukkan di dalam rentang 0.0 sampai dengan 4.0 (0.0 <= IPK <= 4.0). Jika IPK tidak pada rentang tersebut maka dikeluarkan pesan: "IPK tidak valid. Harus antara 0.0 dan 4.0".
5.	Jelaskan bagaimana cara kerja method nilaiKinerja() dalam mengevaluasi kinerja mahasiswa,  kriteria apa saja yang digunakan untuk menentukan nilai kinerja tersebut, dan apa yang dikembalikan (di-return-kan) oleh method nilaiKinerja() tersebut?
6.	Commit dan push kode program ke Github

---

##  Jawaban

1.  2 karakteristik dari class atau object adalah atribut (sebuah variable yang menyimpan data atau status dari object) dan method (fungsi yang mendefinisikan tingkah laku atau sesuatu yang dapay dilakukan oleh objek tersebut)
2.  ada 4 yaitu nama, nim, kelas, dan ipk
3.  ada 4 juga yaitu tampilkanInformasi(), ubahKelas(String kelasBaru), updateIpk(double ipkBaru), dan nilaiKinerja()
4.  done

    ```java
        void updateIpk (double ipkBaru){
            if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
                ipk = ipkBaru;
            }else{
                System.out.println("IPK yang anda masukkan tidak valid, silahkan masukkan IPK kembali");
            }
        }
    ```

5.  - cara kerja method ini adalah dengan memeriksa nilai yang tersimpan pada atribut ipk menggunakan if-else
    - kriteria penilaiannya yaitu jika ipk lebih atau sama dengan 3.5 maka dianggap kinerja sangat baik, jika ipk lebih atau sama dengan 3 maka dianggap kinerja baik, jika ipk lebih atau sama dengan  2 maka dianggap kinerja cukup, dan jika ipk kurang dari 2 maka dianggap kinerja kurang
    - nilai yang dikembalikan (return) berupa String contoh jika ipk == 3.6 maka return nya adalah "Kinerja sangat baik"

6.  done    

---

#   Percobaan 2

##  Soal 

1.	Pada class MahasiswaMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi! Apa nama object yang dihasilkan?
2.	Bagaimana cara mengakses atribut dan method dari suatu objek?
3.	Mengapa hasil output pemanggilan method tampilkanInformasi() pertama dan kedua berbeda?

---

##  Jawaban

1.  baris code proses instansiasi adalah berikut:

    ```java
        Mahasiswa23 mhs1 = new Mahasiswa23();
    ```

    object yang dihasilkan adalah mhs1
2.  menggunakan operator titik (.) setelah nama object untuk mengakses attibute atau method nya, contoh mhs1.tampikanInformasi()
3.  sebelumnya pada method main() terdapat 2 pemanggilan method tampilkanInformasi(), hasilnya bisa berbeda karena terdapat perubahan data diantara kedua pemanggilan method tampilkanInformasi() tersebut

---

#   Percobaan 3

##  Soal 

1.	Pada class Mahasiswa di Percobaan 3, tunjukkan baris kode program yang digunakan untuk mendeklarasikan konstruktor berparameter!
2.	Perhatikan class MahasiswaMain. Apa sebenarnya yang dilakukan pada baris program berikut? 

    ```java
        Mahasiswa23 mhs2 = new Mahasiswa23("Jane Doe", "254100000001", 3.99, "SIB 1F");
    ```

3.	Hapus konstruktor default pada class Mahasiswa, kemudian compile dan run program. Bagaimana hasilnya? Jelaskan mengapa hasilnya demikian!
4.  Setelah melakukan instansiasi object, apakah method di dalam class Mahasiswa harus diakses secara berurutan? Jelaskan alasannya!
5.	Buat object baru dengan nama mhs<NamaMahasiswa> menggunakan konstruktor berparameter dari class Mahasiswa!
6.	Commit dan push kode program ke Github



---

##  Jawaban

1.  berikut baris code nya:

    ```java
        public Mahasiswa23(String nm, String nim, double ipk, String kls){
            nama = nm;
            this.nim = nim;
            this.ipk = ipk;
            kelas = kls;
        }
    ```

2.  yang terjadi pada baris kode tersebut adalah proses instansiasi yaitu membuat objek baru (mhs2) dan proses inisialisasi yaitu pengisian atribut dari mhs2 pada parameter
3.  jika di run maka akan terjadi error, hal tersebut dapat terjadi karena pada main() tepatnya pada instansiasi objetc, object mhs1 menggunakan konstruktor default atau non-parameter, sedangkan pada class Mahasiswa23 terdapat konstruktor berparameter, jadi ketika konstruktor non-parameter nya dihapus maka sistem akan menganggap user akan membuat objek secara manual menggunakan konstruktor berparameter. Lalu pada instansiasi object mhs1 masih merujuk pada konstruktor default atau tidak berparameter, jadi akan terjadi error karena konstruktor non-parameter telah dihapus dan konstruktor default java telah dihapus paksa karena ada konstruktor lain. 
4.  tidak. karena method dalam sebuah class bersifat independen, bebas diakses yang mana dulu, urutan akses method disesuaikan dengan hasil yang diinginkan oleh user.
5.  done
    ```java
        Mahasiswa23 mhsRidok = new Mahasiswa23("Taufiqi Ridho Maulana", "254107060058", 3.5, "SIB 1Z");
        mhsRidok.updateIpk(3.6);
        mhsRidok.ubahKelas("SIB 1F");
        mhsRidok.tampilkanInformasi();
    ```

---

