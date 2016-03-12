/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketing;

/**
 *
 * @author my computer
 */
public class Ticketing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gerbong g1 = new Gerbong("Ekonomi",50);
	Gerbong g2 = new Gerbong("Bisnis",50);
	Gerbong g3 = new Gerbong("Eksekutif",50);
	Kereta k1 = new Kereta("123AKU","Sanjaya","Budi");
	Stasiun s1 = new Stasiun("JKD","JAKARTA PUSAT");
	Stasiun s2 = new Stasiun("JJJ","JAKAJAKAJAKA");
	Stasiun s3 = new Stasiun("BDG","BANDUNG");
	Rute r1 = new Rute(3);
	Tiket t1 = new Tiket("12 Januari 2016","SANTI",3,"Ekonomi","Jakarta","Bandung");
	k1.addGerbong(g1);
	k1.addGerbong(g2);
	k1.addGerbong(g3);
	r1.addStasiun(s1);
	r1.addStasiun(s2);
	r1.addStasiun(s3);
	t1.setKereta(k1);
	t1.setRute(r1);
	t1.setHargaTiket();
	t1.setNKursi();
	t1.cetakTiket();
    }
    
}
