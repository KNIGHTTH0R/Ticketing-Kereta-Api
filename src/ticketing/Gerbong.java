public class Gerbong {
        private String namaGerbong;
        private int jumlahKursi;
        private int maxKursi;
                
        public Gerbong(String namaGerbong, int maxKursi){
            this.namaGerbong=namaGerbong; 
            this.maxKursi=maxKursi;
        }
        public void setNamaGerbong(String namaGerbong){
		this.namaGerbong = namaGerbong;
        }
        public void addKursi(int jumlahKursi){
           	if(maxKursi!=0){
			this.jumlahKursi = jumlahKursi;
			int n = maxKursi - jumlahKursi;
			this.maxKursi = n;
		}
		else{
			System.out.println("Kursi Sudah Penuh !");
		}
        }
         
        public String getNamaGerbong(){
            return namaGerbong;
	}         
                
        public int getjumlah(){
            return jumlahKursi;
	} 
                        
	public int getMaxKursi(){
            return maxKursi;
	} 
       
    public String toString(){
    return "Nama Gerbong : "+getNamaGerbong()+" dengan sisa kursi "+getMaxKursi();
            
    } 
                
                
          
}
    
