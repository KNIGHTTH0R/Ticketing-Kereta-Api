/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

/**
 *
 * @author Dika
 */
public class Rute{
	private Stasiun[] stasiun;
	private int nStasiun = 0;
	private int maxStasiun;
        
	public Rute(int maxStasiun){
		this.maxStasiun = maxStasiun;
		stasiun = new Stasiun[maxStasiun];
	}
	public void addStasiun(Stasiun s){
		if(nStasiun<=maxStasiun){
			stasiun[nStasiun] = s;
			nStasiun++;
		}
		else{
			System.out.println("Rute Penuh !");
		}
	}
	public Stasiun getStasiun(int n){
		return stasiun[n];
	}
	public void getDaftarStasiun(){
		System.out.println("========= RUTE PERJALANAN =========");
		for(int i=0; i<nStasiun; i++){
			int j= i+1;
			System.out.println(j+". "+stasiun[i].getNamaStasiun());
		}
	}
}
