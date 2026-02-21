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

---
