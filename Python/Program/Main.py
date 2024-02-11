# Saya Fikry Idham Dwiyana NIM 2101294 mengerjakan Latihan 1
# dalam mata kuliah Desain dan Pemrograman Berorientasi Objek 
# untuk keberkahanNya maka saya tidak melakukan kecurangan 
# seperti yang telah dispesifikasikan. Aamiin.

from CRUD import CRUD

#deklarasi list
dprri = []
id = ""
n = 0
flag = True

#perulangan selama inputan bukan 5
while flag:
	#inputan untuk pemilihan menu
	print("\nMasukkan menu (1 : Input, 2 : ubah, 3 : hapus, 4 : Tampil, 5 : Keluar):")
	n = int(input())
	# masukkan 1 untuk menambahkan data
	if(n == 1):
		CRUD.add(dprri)

	# masukkan 2 untuk mengubah data
	if(n == 2):
		print("Masukkan Id Anggota yang akan diubah:")
		id = str(input())
		CRUD.update(id, dprri)

	# masukkan 3 untuk menghapus data
	if(n == 3):
		print("Masukkan Id Anggota yang akan dihapus:")
		id = str(input())
		CRUD.delete(id, dprri)

	# masukkan 4 untuk menampilkan data
	if(n == 4):
		CRUD.show(dprri)

	if(n == 5):
		flag = False