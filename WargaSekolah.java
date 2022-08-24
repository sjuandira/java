package com.mycompany.daftarsekolah;

/**
 *
 * @author Asus
 */
public class WargaSekolah {
    private String name;
    private int umur;
    private String jk;
    private String tl;

    public WargaSekolah(String name, int umur, String jk, String tl) {
        this.name = name;
        this.umur = umur;
        this.jk = jk;
        this.tl = tl;
    }

    
    
    public void setName(String name){
        this.name = name;
        
    }
    public String getName(){
        return name;
    }
    public void setUmur(int umur){
        this.umur = umur;
    }
    public int getUmur(){
        return umur;
    }
    public void setJk(String jk){
        this.jk = jk;
    }
    public String getJk(){
        return jk;
    }
    public void setTl(String tl){
        this.tl = tl;
    }
    public String getTl(){
        return tl;
    }
    
    public void TambahUmur(int tambah){
        this.umur = umur+tambah;
    }

    

   

   
    
}
