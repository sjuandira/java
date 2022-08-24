package com.mycompany.daftarsekolah;
/**
 *
 * @author Asus
 */
public class Sekolah {
   
    private String nama;
    private String jenjang;
    private int js;private int news;

    public Sekolah(String nama, String jenjang, int js) {
        this.nama = nama;
        this.jenjang = jenjang;
        this.js = js;
        
    }
    public void setnamasekolah(String nama){
        this.nama= nama;
        
    }
    public String getnamasekolah(){
        return this.nama;
        
    }

    public String getJenjang() {
        return jenjang;
    }

    public void setJenjang(String jenjang) {
        this.jenjang = jenjang;
    }

    public int getJs() {
        return js;
    }

    public void setJs(int js) {
        this.js = js;
    }
    public void setNews(int news){
        
    }
    public void tambahSiswa(int news){
        this.js= js+news;
    }
    
}
