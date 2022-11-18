package kendaraan;

/**
 *
 * @author Asus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Daftar prhitungan pajak\n");
        Kendaraan mbl= new Minibus("B 3 DA",18000000);        
        Kendaraan mtr= new Motor("A 5 LI",1000000);        
        Kendaraan bj= new Bajaj ("S 415 A",150000);
        
        Kendaraan[] kendaraan= new Kendaraan[3];        
        kendaraan[0]= mbl;
        kendaraan[1]= mtr;
        kendaraan[2]= bj;
        for(int i=0; i<3; i++){
            kendaraan[i].print();
//            System.out.println();
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kendaraan;

/**
 *
 * @author Asus
 */
public abstract class Kendaraan implements ViewPjk {
    protected String noPol;
    
    
//    public Kendaraan(String noPol){
//        this.noPol= noPol;
//    }
//    public Kendaraan(){}
    public abstract double pajakThn();
    public String getNoPol() {
        return noPol;
    }
    public void setNoPol(String noPol) {
        this.noPol = noPol;
    }  
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kendaraan;

/**
 *
 * @author Asus
 */
public class Minibus extends Kendaraan {
    private int njkb;        
    
    public Minibus(String noPol,int njkb){
        this.noPol= noPol;
        this.njkb=njkb;        
    }

    public int getNjkb() {
        return njkb;
    }

    public void setNjkb(int njkb) {
        this.njkb = njkb;
    }
    
//    public Minibus(){}
    @Override
    public double pajakThn(){   
        return 0.2*njkb+143000+100000;
    }    
    @Override
    public void print() {
        System.out.println("Pajak mobil");
        System.out.println("Nomor Polisi: "+ noPol);
        System.out.println("Pajak tahunan: Rp."+ pajakThn());
        System.out.println();
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kendaraan;

/**
 *
 * @author Asus
 */
public class Motor extends Kendaraan {
    private int njkb;        
    
    public Motor(String noPol,int njkb){
        this.noPol= noPol;
        this.njkb=njkb;        
    }

    public int getNjkb() {
        return njkb;
    }
    public void setNjkb(int njkb) {
        this.njkb = njkb;
    }    
//    public Motor(){}
    @Override
    public double pajakThn(){   
        return 0.2*njkb+35000+100000;
    } 
    @Override
    public void print() {
        System.out.println("Pajak motor");
        System.out.println("Nomor Polisi: "+ noPol);
        System.out.println("Pajak tahunan: Rp."+ pajakThn());
        System.out.println();
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kendaraan;

/**
 *
 * @author Asus
 */
public class Bajaj extends Kendaraan {
    private int njkb;        
    
    public Bajaj(String noPol,int njkb){
        this.noPol= noPol;
        this.njkb=njkb;        
    }
//    public Bajaj(){}
    public int getNjkb() {
        return njkb;
    }
    public void setNjkb(int njkb) {
        this.njkb = njkb;
    }    
    @Override
    public double pajakThn(){   
        return 0.2*njkb+100000+150000;
    } 
    @Override
    public void print() {
        System.out.println("Pajak Bajaj");
        System.out.println("Nomor Polisi: "+ noPol);
        System.out.println("Pajak tahunan: Rp."+ pajakThn());
        System.out.println();
        
    }        
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kendaraan;

/**
 *
 * @author Asus
 */
public interface ViewPjk {
    void print();
}
