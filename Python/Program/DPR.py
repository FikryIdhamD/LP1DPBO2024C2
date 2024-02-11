# Saya Fikry Idham Dwiyana NIM 2101294 mengerjakan Latihan 1
# dalam mata kuliah Desain dan Pemrograman Berorientasi Objek 
# untuk keberkahanNya maka saya tidak melakukan kecurangan 
# seperti yang telah dispesifikasikan. Aamiin.

#deklarasi class DPR
class DPR:
	#atribut (private)
	__id = ""
	__nama = ""
	__bidang = ""
	__partai = ""

	#constructor
	def __init__(self, id = "", nama = "", bidang = "", partai = ""):
		self.__id = id
		self.__nama = nama
		self.__bidang = bidang
		self.__partai = partai

	#method untuk set id
	def setId(self, id):
		self.__id = id

	#method untuk mendapatkan value dari id
	def getId(self):
		return self.__id
	
	#method untuk set nama DPR
	def setName(self, nama):
		self.__nama = nama

	#method untuk mendapatkan value dari nama
	def getName(self):
		return self.__nama

	#method untuk set bidang
	def setBidang(self, bidang):
		self.__bidang = bidang

	#method untuk mendapatkan value dari bidang
	def getBidang(self):
		return self.__bidang

	#method untuk set partai
	def setPartai(self, partai):
		self.__partai = partai

	#method untuk mendapatkan value dari partai
	def getPartai(self):
		return self.__partai

	#bahasa python tidak memerlukan destructor karena sudah ada garbage collector