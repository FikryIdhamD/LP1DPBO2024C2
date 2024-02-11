<!-- Saya Fikry Idham Dwiyana 2101294 mengerjakan Latihan 1
dalam mata kuliah Desain dan Pemrograman Berorientasi Objek 
untuk keberkahanNya maka saya tidak melakukan kecurangan 
seperti yang telah dispesifikasikan. Aamiin. -->
<?php

//import library
require ('CRUD.php');
require ('DPR.php');

//membuat array
$data = [];
//instance object berdasarkan class CRUD
$crud = new CRUD();

//instance object berdasarkan class DPR
$dpr[0] = new DPR();
$dpr[1] = new DPR();
$dpr[2] = new DPR();

//proses menambahkan data awal
$crud->add($data, $dpr, 0, "222", "Yasin", "Cyber Security", "PDIP", "image/image1.png");
$crud->add($data, $dpr, 1, "333", "Mia", "Tim Sukses", "Demokrat", "image/image2.png");
$crud->add($data, $dpr, 2, "444", "Alif", "Juru Bicaraz", "PSI", "image/image3.png");
echo '<b>List DPR Awal:</b>' . '<br>';
//Menampilkan data DPR
$crud->show($data);

//proses perubahan (delete dan update data) serta menampilkan data setelah perubahan
$crud->update($data, 222, "212", "Fauzan", "Sekretaris", "PSI");
$crud->update($data, 444, "911", "Bintang", "Ketua Umum", "PDIP");
echo '<b>List DPR Setelah Perubahan:</b>' . '<br>';
$crud->show($data);

$crud->delete($data, 911);
echo '<b>List DPR Setelah Penghapusan:</b>' . '<br>';
$crud->show($data);

?>