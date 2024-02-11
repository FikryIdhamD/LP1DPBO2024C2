<!-- Saya Fikry Idham Dwiyana NIM 2101294 mengerjakan Latihan 1
dalam mata kuliah Desain dan Pemrograman Berorientasi Objek 
untuk keberkahanNya maka saya tidak melakukan kecurangan 
seperti yang telah dispesifikasikan. Aamiin. -->

<?php

//deklarasi class CRUD
class CRUD
{
	//constructor
	public function __construct()
	{

	}

	//method untuk menambahkan data (create)
	public function add(&$list, $dpr, $idx2, $id, $nama, $bidang, $partai, $image)
	{
		//set data dari paramater dan masukan ke array
		$dpr[$idx2]->setId($id);
		$dpr[$idx2]->setName($nama);
		$dpr[$idx2]->setBidang($bidang);
		$dpr[$idx2]->setPartai($partai);
		$dpr[$idx2]->setImage($image);

		$list[$idx2] = $dpr[$idx2];
	}

	//method untuk mengubah data (update)
	public function update(&$list, $Cariid, $id, $nama, $bidang, $partai)
	{
		//perulangan untuk mencari data (berdasarkan Id)
		foreach($list as $llist)
		{
			//jika ketemu maka set dengan data baru dari parameter
			if($llist->getId() == $Cariid)
			{
				$llist->setId($id);
				$llist->setName($nama);
				$llist->setBidang($bidang);
				$llist->setPartai($partai);
			}
		}
	}

	//method untuk menghapus data (delete)
	public function delete(&$list, $Hapusid)
	{
		$i;
		//perulangan untuk mencari data (berdasarkan Id)
		for($i = 0; $i < count($list); $i++)
		{
			if($list[$i]->getId() == $Hapusid)
			{
				array_splice($list, $i, 1);
			}
		}
	}

	//method untuk menampilkan data (read)
	public function show($list)
	{
		//output berupa tabel
		echo "<table border='1' cellspacing='0' cellpading='10' cellpadding='10'";
		echo "<tr>";
		echo "<th>No</th>";
		echo "<th>Id</th>";
		echo "<th>Nama</th>";
		echo "<th>Bidang</th>";
		echo "<th>Partai</th>";
		echo "<th>Foto Profil</th>";
		echo "</tr>";
		$j = 1;
		$i;
		for($i = 0; $i < count($list); $i++)
		{
			echo "<tr>";
			echo  "<td>" . $j . '. ' . "</td>";
			echo "<td>" . $list[$i]->getId() . "</td>";
			echo "<td>" . $list[$i]->getName() . "</td>";
			echo "<td>" . $list[$i]->getBidang() . "</td>";
			echo "<td>" . $list[$i]->getPartai() . "</td>";
			echo "<td>" . "<img src='" . $list[$i]->getImage() . "' style='width: 100px;'>" . '</td>';
			echo "</tr>";
			$j = $j + 1;
		}
		echo "</table>";
		echo "<br>";
	}

	//destructor
	public function __destruct()
	{
		
	}
}

?>