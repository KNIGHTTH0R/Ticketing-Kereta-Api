public class Stasiun{
	private String kodeStasiun;
	private String namaStasiun;
	
	public Stasiun(String kodeStasiun, String namaStasiun){
		this.kodeStasiun = kodeStasiun;
		this.namaStasiun = namaStasiun;
	}
	
	public void setKodeStasiun(String kodeStasiun){
		this.kodeStasiun = kodeStasiun;
	}
	public void setNamaStasiun(String namaStasiun){
		this.namaStasiun = namaStasiun;
	}
	public String getKodeStasiun(){
		return kodeStasiun;
	}
	
	public String getNamaStasiun(){
		return namaStasiun;
	}
	public String toString(){
		return "Nama Stasiun "+getNamaStasiun();
	}
}