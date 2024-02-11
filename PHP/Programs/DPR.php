<!-- Saya Fikry Idham Dwiyana NIM 2101294 mengerjakan Latihan 1
dalam mata kuliah Desain dan Pemrograman Berorientasi Objek 
untuk keberkahanNya maka saya tidak melakukan kecurangan 
seperti yang telah dispesifikasikan. Aamiin. -->
<?php

//deklarasi class DPR
class DPR
{
	//atribut
	private $id = "";
	private $nama = "";
	private $bidang = "";
	private $partai = "";
	private $image = "";

	//constructor
	public function __construct($id = "",$nama = "", $bidang = "", $partai = "", $image = "")
	{
		$this->id = $id;
		$this->nama = $nama;
		$this->bidang = $bidang;
		$this->partai = $partai;
		$this->image = $image;
	}

	//method untuk set id
	public function setId($id)
	{
		$this->id = $id;
	}

	//method untuk mendapatkan value dari id
	public function getId()
	{
		return $this->id;
	}

	//method untuk set nama
	public function setName($nama)
	{
		$this->nama = $nama;
	}

	//method untuk mendapatkan value dari nama
	public function getName()
	{
		return $this->nama;
	}

	//method untuk set bidang
	public function setBidang($bidang)
	{
		$this->bidang = $bidang;
	}

	//method untuk mendapatkan value dari bidang
	public function getBidang()
	{
		return $this->bidang;
	}

	//method untuk set Partai
	public function setPartai($partai)
	{
		$this->partai = $partai;
	}

	//method untuk mendapatkan value dari partai
	public function getPartai()
	{
		return $this->partai;
	}

	//method untuk set foto profil
	public function setImage($image)
	{
		$this->image = $image;
	}

	//method untuk mendapatkan value dari foto profil
	public function getImage()
	{
		return $this->image;
	}

	//destructor
	public function __destruct()
	{

	}
}

?>