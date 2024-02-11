/*Saya Fikry Idham Dwiyana NIM 2101294 mengerjakan Latihan 1
dalam mata kuliah Desain dan Pemrograman Berorientasi Objek 
untuk keberkahanNya maka saya tidak melakukan kecurangan 
seperti yang telah dispesifikasikan. Aamiin.*/


//inisialisasi class DPR
public class DPR
{
	//atribut
	private int id;
	private String nama;
	private String bidang;
	private String partai;

	//constructor
	public DPR()
	{
		this.id = 0;
		this.nama = "";
		this.bidang = "";
		this.partai = "";
	}

	//method untuk set nama
	public void setId(int id)
	{
		this.id = id;
	}

	//method untuk mendapatkan value dari id
	public int getId()
	{
		return this.id;
	}

	//method untuk set nama
	public void setName(String nama)
	{
		this.nama = nama;
	}

	//method untuk mendapatkan value dari nama
	public String getName()
	{
		return this.nama;
	}

	//method untuk set bidang
	public void setBidang(String bidang)
	{
		this.bidang = bidang;
	}

	//method untuk mendapatkan value dari bidang
	public String getBidang()
	{
		return this.bidang;
	}

	//method untuk set fakultas
	public void setPartai(String partai)
	{
		this.partai = partai;
	}

	//method untuk mendapatkan value dari fakultas
	public String getPartai()
	{
		return this.partai;
	}

	//java tidak memerlukan destructor karena sudah garbage collection
}