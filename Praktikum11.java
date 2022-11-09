package praktikum11_salsabilajuandira;


public class Praktikum11_SalsabilaJuandira {
    
    public static void main(String[] args) {
        BangunDatar lingkaran= new Lingkaran(10,"Merah");
        BangunDatar segitiga= new Segitiga(13,5,"Kuning");
        BangunDatar segiempat= new Segiempat(5,"Hijau");
        
        BangunDatar[] bangunDatar= new BangunDatar[3];
        bangunDatar[0]= lingkaran;
        bangunDatar[1]= segitiga;
        bangunDatar[2]= segiempat;
        
        for(int i=0; i<3; i++){
//            System.out.println("Bangun Datar: "+i+1);
//            System.out.println("Warna: "+bangunDatar[i].getWarna());
//            System.out.println("Luas: "+bangunDatar[i].Luas());
//            System.out.println("Keliling: "+bangunDatar[i].Keliling());
//            System.out.println();
            bangunDatar[i].print();
            System.out.println();
            
        }
    }
    
}
//class diagram
package praktikum11_salsabilajuandira;

public abstract class BangunDatar implements ViewData {
    protected String warna;
    
    public abstract double Luas();
    public abstract double Keliling();

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    
}
//class lingkaran
package praktikum11_salsabilajuandira;

public class Lingkaran extends BangunDatar {
    private double jari;

    public Lingkaran(double jari, String warna) {
        this.jari = jari;
        this.warna= warna;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    @Override
    public double Luas() {
        return Math.PI*jari*jari;
    }

    @Override
    public double Keliling() {
        return Math.PI*jari*2;
    }    

    @Override
    public void print() {
        System.out.println("Lingkaran");
        System.out.println("Warna: "+warna);
        System.out.println("Jari-jari: "+jari);
        System.out.println("Luas; "+Luas());
        System.out.println("Keliling: "+Keliling());
    }
    
}
//class segitiga
package praktikum11_salsabilajuandira;

public class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;
    
    public Segitiga(double alas, double tinggi, String warna){
        this.alas= alas;
        this.tinggi=tinggi;    
        this.warna= warna;
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    

    @Override
    public double Luas() {
        return alas*tinggi/2;
    }

    @Override
    public double Keliling() {
        return 3*alas;
    }
    @Override
    public void print() {
        System.out.println("Segi Tiga");
        System.out.println("Warna: "+warna);
        System.out.println("Alas: "+alas);
        System.out.println("Tinggi: "+tinggi);
        System.out.println("Luas; "+Luas());
        System.out.println("Keliling: "+Keliling());
    }
}
//class segi empat
package praktikum11_salsabilajuandira;

public class Segiempat extends BangunDatar{
    private double sisi;

    public Segiempat(double sisi, String warna) {
        this.sisi = sisi;
        this.warna= warna;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    @Override
    public double Luas() {
        return sisi*sisi;
    }

    @Override
    public double Keliling() {
        return 4*sisi;
    }
    @Override
    public void print() {
        System.out.println("Segi Empat");
       System.out.println("Warna: "+warna);
        System.out.println("Sisi: "+sisi);
        System.out.println("Luas; "+Luas());
        System.out.println("Keliling: "+Keliling());
    }
    
    
}
//interface
package praktikum11_salsabilajuandira;
public interface ViewData {
    void print();      
}

