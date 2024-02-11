/*Saya Fikry Idham Dwiyana NIM 2101294 mengerjakan Latihan 1
dalam mata kuliah Desain dan Pemrograman Berorientasi Objek 
untuk keberkahanNya maka saya tidak melakukan kecurangan 
seperti yang telah dispesifikasikan. Aamiin.*/


//library yang digunakan
import java.util.Scanner;
import java.util.ArrayList;

//deklarasi class Main
//pada java semuanya harus dibuat dalam class, maka main pun dibuat menjadi sebuah class
public class Main
{
	public static void main(String[] args)
	{
		//deklarasi list / arraylist
		ArrayList<DPR> list = new ArrayList<>();
		//instance object menggunakan class CRUD
		CRUD crud = new CRUD();
		//membuat scanner untuk inputan
		Scanner sc = new Scanner(System.in);
		int id;

		int n = 0;
		//perulangan selama inputan bukan 5
		do
		{
			//input untuk pemilihan menu
			System.out.println("\nMasukkan menu (1 : Input, 2 : ubah, 3 : hapus, 4 : Tampil, 5 : Keluar):");
			n = sc.nextInt();
			if(n != 5)
			{
				//jika inputan 1 maka menambahkan data
				if(n == 1)
				{
					crud.add(list);
				}

				//jika inputan 2 maka mengubah data
				if(n == 2)
				{
					System.out.print("Masukkan Id Anggota yang akan diubah:");
					id = sc.nextInt();
					crud.update(id, list);
				}

				//jika inputan 3 maka menghapus data
				if(n == 3)
				{
					System.out.print("Masukkan Id Anggota yang akan dihapus:");
					id = sc.nextInt();
					crud.delete(id, list);
				}

				//jika inputan 4 maka menampilkan data
				if(n == 4)
				{
					crud.show(list);
				}
			}
		}while(n != 5);

		//close untuk scanner
		sc.close();
	}
}