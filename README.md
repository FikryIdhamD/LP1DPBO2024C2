# LP1DPBO2024C2

Janji :
Saya Fikry Idham Dwiyana NIM 2101294 mengerjakan soal Latihan 1
dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya
maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
Aamiin.

# Tugas LATIHAN1DPBO2023
Buatlah program berbasis OOP menggunakan bahasa pemrograman C++, Java, Python, dan PHP yang menampilkan informasi daftar anggota DPR (sekumpulan objek anggota DPR) dan memiliki fitur menambah, mengubah, dan menghapus data. Setiap anggota DPR memiliki data id, nama, nama bidang, nama partai, dan foto profil (khusus bahasa PHP). 

Note:
- Boleh menambahkan properti/atribut baru
- Tampilkan data selengkap-lengkapnya dalam bentuk list/tabel
- Program dikumpulkan pada repository GitHub yang dibuat public dengan nama “LP1DPBO2024C…”
  - Hanya program pada branch Main yang akan dinilai dan diperiksa 
  - Jika waktu pengumpulan sudah habis dan ingin mengupdate kode program, update pada branch lain karena mengupdate branch Main setelah waktu pengumpulan terlewat maka program tidak akan dinilai 
- Struktur folder 
  - CPP:
    - program
    - screenshot
  - Java
  - Python
  - PHP
  - README.md : File README berisi desain program, penjelasan alur, dan dokumentasi saat program dijalankan (screenshot/screen record, pilih salah satu bahasa sebagai contoh)
  - Submit link repository pada form berikut: https://forms.gle/7q2sWJidaqkY41sY8

## Desain Program
Desain yang saya buat menggunakan 2 Class:
* DPR
* Crud

`Class Mahasiswa` memiliki total lima atribut:
* **Id** -> Id Anggota, `Integer' untuk C++ & Java, `string` untuk PHP & Python
* **Nama** -> Nama Anggota, `string`
* **Bidang** -> Bidang/Keahlian Anggota, `string`
* **Partai** -> Partai Anggota, `string`
* **Foto** (khusus bahasa PHP) -> foto random, `string`

Tiap atribut memiliki setter dan getternya masing-masing yang berada pada class `DPR`.

Pada class `CRUD` juga memiliki lima atribut yang sama seperti class `DPR` tapi digunakan hanya sebagai tempat tampungan inputan untuk method `add` dan `update`.
Pada class `CRUD` memiliki empat method:
* **add**    -> untuk menambahkan data mahasiswa
* **update** -> untuk mengubah data mahasiswa
* **delete** -> untuk menghapus data mahasiswa
* **show**   -> untuk menampilkan data mahasiswa

## Alur Program
**semua program mempunyai alur yang sama, kecuali PHP karena inputan secara hardcore dari codenya**

Pengguna akan diminta untuk mengetikkan perintah pada command prompt

Pengguna dapat memilih untuk mengetikkan serangkaian perintah berikut pada command prompt

- ketik '1' untuk menjalankan perintah `add`
  User akan diminta mengisi data Anggota, bila Id telah terisi data akan gagal untuk ditambahkan.
- ketik '2' untuk menjalankan perintah `update`
  User akan diminta mengisi Id yang dicari, bila ditemukan user akan diminta untuk mengisi kembali data, bila tidak ditemukan akan mengeluarkan pesan error.
- ketik '3' untuk menjalankan perintah `delete`
  User akan diminta Id yang akan di Delete, bila Id tersedia, data akan terhapus. Bila tidak, akan menampilkan pesan error
- ketik '4' untuk menjalankan perintah `show`
  Program akan mencetak seluruh data anggota dalam tabel
- ketik '5' untuk keluar dari program / mengakhiri program.
  
## Dokumentasi
Pada program Java

![Bukti_Java](https://github.com/FikryIdhamD/LP1DPBO2024C2/blob/main/Java/Screenshot/Screenshot_3.png)
![Bukti_Java2](https://github.com/FikryIdhamD/LP1DPBO2024C2/blob/main/Java/Screenshot/Screenshot_4.png)

Pada program PHP

![Bukti_PHP](https://github.com/FikryIdhamD/LP1DPBO2024C2/blob/main/PHP/Screenshot/Screenshot_1.png)
![Bukti_PHP2](https://github.com/FikryIdhamD/LP1DPBO2024C2/blob/main/PHP/Screenshot/Screenshot_2.png)
![Bukti_PHP3](https://github.com/FikryIdhamD/LP1DPBO2024C2/blob/main/PHP/Screenshot/Screenshot_3.png)
