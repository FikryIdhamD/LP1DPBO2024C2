/*Saya Fikry Idham Dwiyana NIM 2101294 mengerjakan Latihan 1
dalam mata kuliah Desain dan Pemrograman Berorientasi Objek 
untuk keberkahanNya maka saya tidak melakukan kecurangan 
seperti yang telah dispesifikasikan. Aamiin.*/

//library yang digunakan
import java.util.Scanner;
import java.util.ArrayList;

//inisialisasi class CRUD
public class CRUD {
	// Tampungan dan penanda
	int id;
	String nama;
	String bidang;
	String partai;
	int i, j;

	// membuat scanner untuk inputan
	Scanner sc = new Scanner(System.in);

	// constructor kosong
	public CRUD() {

	}

	// method untuk untuk menambahkan data (create)
	public void add(ArrayList<DPR> list) {
		// instance object menggunakan class DPR
		DPR temp = new DPR();
		j = 0;

		// inputan data DPR
		System.out.print("Masukkan Id:");
		id = sc.nextInt();
		System.out.print("Masukkan Nama:");
		nama = sc.next();
		System.out.print("Masukkan Bidang:");
		bidang = sc.next();
		System.out.print("Masukkan Partai:");
		partai = sc.next();

		// perulangan untuk pengecekan apakah data sudah tersedia (berdasarkan Id)
		for (i = 0; i < list.size(); i++) {
			if (id == list.get(i).getId()) {
				System.out.println("\nTidak dapat menambahkan data, Id sudah tersedia!");
				j = 1;
			}
		}

		// jika data belum tersedia maka set data dan masukkan ke list
		if (j == 0) {
			temp.setId(id);
			temp.setName(nama);
			temp.setBidang(bidang);
			temp.setPartai(partai);

			list.add(temp);
			System.out.println("\nData berhasil ditambahkan!");
		}
	}

	// method untuk mengubah data (update)
	public void update(int id, ArrayList<DPR> list) {
		j = 0;

		// perulangan untuk mencari data DPR yang akan diubah (berdasarkan Id)
		for (i = 0; i < list.size(); i++) {
			// jika ketemu maka ubah data dengan inputan baru
			if (id == list.get(i).getId()) {
				System.out.print("Masukkan Id:");
				id = sc.nextInt();
				System.out.print("Masukkan Nama:");
				nama = sc.next();
				System.out.print("Masukkan Bidang:");
				bidang = sc.next();
				System.out.print("Masukkan Partai:");
				partai = sc.next();

				list.get(i).setId(id);
				list.get(i).setName(nama);
				list.get(i).setBidang(bidang);
				list.get(i).setPartai(partai);

				System.out.println("\nData berhasil diubah!");
				j = 1;
			}
		}
		// jika data tidak tersedia
		if (j == 0) {
			System.out.println("\nData tidak tersedia!");
		}
	}

	// method untuk menghapus data (delete)
	public void delete(int id, ArrayList<DPR> list) {
		j = 0;

		// perulangan untuk mencari data DPR yang akan dihapus (berdasarkan Id)
		for (i = 0; i < list.size(); i++) {
			// jika ketemu maka hapus data
			if (id == list.get(i).getId()) {
				list.remove(list.get(i));
				System.out.println("\nData berhasil dihapus!");
				j = 1;
			}
		}

		// jika data tidak tersedia
		if (j == 0) {
			System.out.println("\nData tidak tersedia!");
		}
	}

	// method untuk menampilkan data (read)
	public void show(ArrayList<DPR> list) {
		// output berupa tabel
		System.out.println("\nList DPR:");
		System.out.println("+=======================================+\n" + "|  Id  |  Nama  |  Bidang  |  Partai  |\n"
				+ "+=======================================+");
		for (i = 0; i < list.size(); i++) {
			System.out.println("| " + Integer.toString(i + 1) + ". " + list.get(i).getId() + " | "
					+ list.get(i).getName() + " | " + list.get(i).getBidang() + " | " + list.get(i).getPartai() + " |");
			System.out.println("+---------------------------------------+");
		}
	}
}