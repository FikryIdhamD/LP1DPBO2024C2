# Saya Fikry Idham Dwiyana NIM 2101294 mengerjakan Latihan 1
# dalam mata kuliah Desain dan Pemrograman Berorientasi Objek 
# untuk keberkahanNya maka saya tidak melakukan kecurangan 
# seperti yang telah dispesifikasikan. Aamiin.

#import class
from DPR import DPR

#deklarasi class CRUD
class CRUD:
	#atribut untuk tampungan
	id = ""
	nama = ""
	bidang = ""
	partai = ""

	#constructor
	def __init__():
		i = 0 #gaboleh kosong

	#method untuk menambahkan data (create)
	def add(dprri):
		j = 0

		#inputan untuk data DPR
		print("Masukkan Id:")
		id = str(input())
		print("Masukkan Nama:")
		nama = str(input())
		print("Masukkan Bidang:")
		bidang = str(input())
		print("Masukkan Partai:")
		partai = str(input())

		#pengecekan apakah data sudah tersedia pada list
		for dpr in dprri:
			if(id == dpr.getId()):
				j = 1
				print("\nTidak dapat menambahkan data, Id sudah terisi!")

		#jika tidak tersedia maha masukkan ke list
		if(j == 0):
			dprri.append(DPR(id, nama, bidang, partai))
			print("\nData berhasil ditambahkan!")

	#method untuk mengubah data (update)
	def update(id, dprri):
		j = 0

		#perulangan untuk mencari data yang akan diubah 
		for dpr in dprri:
			if(id == dpr.getId()):
				#inputan untuk data yang akan diubah
				print("Masukkan Id:")
				id = str(input())
				print("Masukkan Nama:")
				nama = str(input())
				print("Masukkan Bidang:")
				bidang = str(input())
				print("Masukkan Partai:")
				partai = str(input())

				dpr.setId(id);
				dpr.setName(nama);
				dpr.setBidang(bidang);
				dpr.setPartai(partai);

				print("\nData berhasil diubah!")

				j = 1

		#jika data tidak tersedia
		if(j == 0):
			print("\nData tidak tersedia!")

	#method untuk menghapus data (delete)
	def delete(id, dprri):
		i = 0
		j = 0

		#perulangan untuk mencari data yang akan dihapus 
		for dpr in dprri:
			if(id == dpr.getId()):
				del dprri[i]
				print("\nData berhasil dihapus!")
				j = 1
			i += 1

		#jika data tidak tersedia
		if(j == 0):
			print("\nData tidak tersedia!")

	#method untuk menampilkan data (read)
	def show(dprri):
		#output berupa tabel
		i = 0
		print("\nList DPR:")
		print("+=======================================+\n" + "|  Id  |  Nama  |  Bidang  |  Partai  |\n" + "+=======================================+")
		for dpr in dprri:
			print("| " + str(i + 1) + ". " + dpr.getId() + " | " + dpr.getName() + " | " + dpr.getBidang() + " | " + dpr.getPartai() + " |")
			print("+---------------------------------------+")
			i += 1