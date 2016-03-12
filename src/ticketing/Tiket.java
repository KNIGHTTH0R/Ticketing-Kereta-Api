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
public class Tiket {
    private Kereta kereta;
    private Rute rute;
    private String tanggal;
    private String namaPemesan;
    private String kelasKereta;
    private int nKursi;
    private String jamBerangkat;
    private String jamDatang;
    private int hargaTiket;
    private String kotaAsal;
    private String kotaTujuan;
    public Tiket(String tanggal, String namaPemesan, int nKursi, String kelasKereta, String kotaAsal, String kotaTujuan){
        this.tanggal = tanggal;
        this.namaPemesan = namaPemesan;
	this.nKursi = nKursi;
	this.kelasKereta = kelasKereta;
        this.kotaAsal = kotaAsal;
        this.kotaTujuan = kotaTujuan;
    }
    public void setKereta(Kereta kereta){
        this.kereta = kereta;
    }
    public void setRute(Rute rute){
        this.rute = rute;
    }
    public void setTanggal(String tanggal){
        this.tanggal = tanggal;
    }
    public void setNamaPemesan(String namaPemesan){
        this.namaPemesan = namaPemesan;
    }
    public void setKelasKereta(String kelasKereta){
        this.kelasKereta = kelasKereta;
    }
    public void setJamBerangkat(String jamBerangkat){
        this.jamBerangkat = jamBerangkat;
    }
    public void setJamDatang(String jamDatang){
        this.jamDatang = jamDatang;
    }
    public void setKotaAsal(String kotaAsal){
        this.kotaAsal = kotaAsal;
    }
    public void setKotaTujuan(String kotaTujuan){
        this.kotaTujuan = kotaTujuan;
    }
    public void setHargaTiket(){
        if(kelasKereta == "Ekonomi"){
            this.hargaTiket = 100000;
	}
	else if (kelasKereta == "Bisnis"){
            this.hargaTiket = 200000;
	}
	else if (kelasKereta == "Eksekutif"){
            this.hargaTiket = 300000;
	}
    }
    public void setNKursi(){
	if(kelasKereta == "Ekonomi"){
            kereta.getGerbong(0).addKursi(nKursi);
	}
	else if (kelasKereta == "Bisnis"){
            kereta.getGerbong(1).addKursi(nKursi);
	}
        else if (kelasKereta == "Eksekutif"){
            kereta.getGerbong(2).addKursi(nKursi);
	}
    }
    public Kereta getKereta(){
        return kereta;
    }
    public Rute getRute(){
        return rute;
    }
    public String getTanggal(){
        return tanggal;
    }
    public String getNamaPemesan(){
        return namaPemesan;
    }
    public String getKelasKereta(){
        return kelasKereta;
    }
    public String getJamBerangkat(){
        return jamBerangkat;
    }
    public String getJamDatang(){
        return jamDatang;
    }
    public String getKotaAsal(){
        return kotaAsal;
    }
    public String getKotaTujuan(){
        return kotaTujuan;
    }
    public int getHargaTiket(){
        return hargaTiket;
    }
    public int getNKursi(){
        return nKursi;
    }
    public void cetakTiket(){
	System.out.println("========== TIKET KERETA ==========");
	System.out.println("Nama Pemesan : "+getNamaPemesan());
	System.out.println("Tanggal      : "+getTanggal());
	System.out.println("Nama Kereta  : "+getKereta().getNamaKereta());
	System.out.println("Kelas Kereta : "+getKelasKereta());
	System.out.println("Kota Asal    : "+getKotaAsal());
	System.out.println("Kota Tujuan  : "+getKotaTujuan());
	System.out.println("Jumlah Kursi : "+getNKursi());
	System.out.println("Harga Tiket  : "+getHargaTiket());
	System.out.println();
	System.out.println("Rute Perjalanan : ");
	getRute().getDaftarStasiun();
	System.out.println();
	System.out.println("Deskripsi Kereta : ");
	getKereta().getDaftarGerbong();
    }
}