/*Saya Fikry Idham Dwiyana NIM 2101294 mengerjakan Latihan 1
dalam mata kuliah Desain dan Pemrograman Berorientasi Objek 
untuk keberkahanNya maka saya tidak melakukan kecurangan 
seperti yang telah dispesifikasikan. Aamiin.*/

//library yang digunakan
#include <iostream>
#include <string>

using namespace std;

//deklarasi class DPR
class DPR
{
	//atribut yang digunakan (diset private)
	private:
		int id;
		string nama;
		string bidang;
		string partai;

	//method yang digunakan (diset public)
	public:
		//constructor
		DPR()
		{
			this->id = 0;
			this->nama = "";
			this->bidang = "";
			this->partai = "";
		}

		/*setter dan getter digunakan karena atribut yang ada pada class DPR bersifat private, 
		sehingga jika ingin diakses oleh class lain harus melalui method*/

		//method untuk set id DPR
		void setId(int id)
		{
			this->id = id;
		}

		//method untuk mendapatkan value dari atribut name
		int getId()
		{
			return this->id;
		}

		//method untuk set nama DPR
		void setName(string nama)
		{
			this->nama = nama;
		}

		//method untuk mendapatkan value dari atribut nama
		string getName()
		{
			return this->nama;
		}

		//method untuk set program studi
		void setBidang(string bidang)
		{
			this->bidang = bidang;
		}

		//method untuk mendapatkan value dari atribut bidang
		string getBidang()
		{
			return this->bidang;
		}

		//method untuk set fakultas
		void setPartai(string partai)
		{
			this->partai = partai;
		}


		//method untuk mendapatkan value dari atribut partai
		string getPartai()
		{
			return this->partai;
		}

		//destructor
		~DPR()
		{

		}
};