/*Saya Fikry Idham Dwiyana NIM 2101294 mengerjakan Latihan 1
dalam mata kuliah Desain dan Pemrograman Berorientasi Objek 
untuk keberkahanNya maka saya tidak melakukan kecurangan 
seperti yang telah dispesifikasikan. Aamiin.*/

//library yang digunakan
#include <bits/stdc++.h>
#include "DPR.cpp"

using namespace std;

//deklarasi class CRUD
class CRUD
{
	public:
		//Tampungan dan penanda
		int id;
		string nama;
		string bidang;
		string partai;
		int j;

		//constructor (dibuat kosong karena tidak diperlukan untuk diisi)
		CRUD()
		{

		}

		//method untuk menambahkan data (create)
		void add(list<DPR> *llist)
		{
			//instance object menggunakan class DPR
			DPR temp;
			j = 0;

			//inputan untuk data DPR
			cout << "Masukkan Id:";
			cin >> id;
			cout << "Masukkan Nama:";
			cin >> nama;
			cout << "Masukkan Bidang:";
			cin >> bidang;
			cout << "Masukkan Partai:";
			cin >> partai;

			//perulangan sebanyak data dalam list
			for(list<DPR>::iterator it = (*llist).begin(); it != (*llist).end(); it++)
			{
				//pengecekan jika Id yang diinput sama dengan Id pada list
				//Id digunakan sebagai primary key
				if(id == it->getId())
				{
					//print warning bahwa data sudah tersedia
					//variabel j digunakan sebagai penanda
					j = 1;
					cout << "\nTidak dapat menambahkan data, ID sudah terdaftar!" << '\n';
				}
			}

			//jika variabel j tetap nol (artinya tidak ada Id yang sama / data belum tersedia)
			if(j == 0)
			{
				//set data inputan ke object tampungan yang sebelumnya telah dibuat
				temp.setId(id);
				temp.setName(nama);
				temp.setBidang(bidang);
				temp.setPartai(partai);

				//push object tersebut ke dalam list
				(*llist).push_back(temp);
				cout << "\nData berhasil ditambahkan!" << '\n';
			}
		}

		//method untuk mengubah data (update)
		void update(int id, list<DPR> *llist)
		{
			//variabel penanda
			j = 0;

			//perulangan sebanyak data pada list
			for(list<DPR>::iterator it = (*llist).begin(); it != (*llist).end(); it++)
			{
				//jika Id pada parameter (yaitu Id yang akan diubah) sama dengan Id pada list
				if(id == it->getId())
				{
					//inputan untuk data yang akan diubah
					cout << "Masukkan Id:";
					cin >> id;
					cout << "Masukkan Nama:";
					cin >> nama;
					cout << "Masukkan Program Bidang:";
					cin >> bidang;
					cout << "Masukkan Partai:";
					cin >> partai;

					//set inputan
					it->setId(id);
					it->setName(nama);
					it->setBidang(bidang);
					it->setPartai(partai);

					cout << "\nData berhasil diubah!" << '\n';

					j = 1;
				}
			}

			//jika variabel j tetap nol (artinya data yang akan diupdate tidak tersedia)
			if(j == 0)
			{
				//print warning bahwa data tidak tersedia
				cout << "\nData tidak tersedia!" << '\n';
			}
		}

		//method untuk menghapus data (delete)
		void del(int id, list<DPR> *llist)
		{
			j = 0;

			//perulangan sebanyak data pada list
			for(list<DPR>::iterator it = (*llist).begin(); it != (*llist).end(); it++)
			{
				//jika Id dari parameter sama dengan Id pada list
				if(id == it->getId())
				{
					//hapus data pada list
					it = (*llist).erase(it);
					it--;
					cout << "\nData berhasil dihapus!" << '\n';
					j = 1;
				}
			}

			//jika data tidak tersedia
			if(j == 0)
			{
				cout << "\nData tidak tersedia!" << '\n';
			}
		}

		//method untuk menampilkan data (read)
		void show(list<DPR> *llist)
		{
			//output dalam bentuk tabel
			cout << "\nList Anggota:\n";
			int i = 0;
			cout << "+=======================================+\n" << "|  Id  |  Nama  |  Bidang  |  Partai  |\n" << "+=======================================+\n";
			for(list<DPR>::iterator it = (*llist).begin(); it != (*llist).end(); it++)
			{
				cout << "| " <<(i + 1) << ". " << it->getId() << " | " << it->getName() << " | " << it->getBidang() << " | " << it->getPartai() << " |\n";
				cout << "+---------------------------------------+\n";
				i++;
			}
		}

		//destructor
		~CRUD()
		{

		}
};