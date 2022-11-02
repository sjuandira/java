
package praktikum10_salsabilajuandira;

public class Praktikum10_SalsabilaJuandira {
    
    public static void main(String[] args) {
        BangunDatar bd= new BangunDatar("hitam");
        System.out.println("Warna bangun datar: "+bd.getWarna());
        System.out.println();
        
        Lingkaran l= new Lingkaran("Merah", 26.0);
        System.out.println("Luas lingkaran: "+l.Luas());
        System.out.println("Keliling lingkaran: "+l.Keliling());
        System.out.println();
        
        SegiTiga st= new SegiTiga("Kuning", 15,7);
        System.out.println("Luas segitiga: "+st.Luas());
        System.out.println("Keliling segitiga: "+st.Keliling());
        System.out.println();
        
        SegiEmpat se= new SegiEmpat("Biru",10);
        System.out.println("Luas segiempat: "+se.Luas());
        System.out.println("Keliling segiempat: "+se.Keliling());
        System.out.println();
        
        //polimorphism
//         BangunDatar bd= new BangunDatar("hitam");
//         System.out.println("Warna bangun datar: "+bd.getWarna());
//         System.out.println();
        
//         BangunDatar l= new Lingkaran("Merah", 26.0);
//         System.out.println("Luas lingkaran: "+l.Luas());
//         System.out.println("Keliling lingkaran: "+l.Keliling());
//         System.out.println();
        
//         BangunDatar st= new SegiTiga("Kuning", 15,7);
//         System.out.println("Luas segitiga: "+st.Luas());
//         System.out.println("Keliling segitiga: "+st.Keliling());
//         System.out.println();
        
//         BangunDatar se= new SegiEmpat("Biru",10);
//         System.out.println("Luas segiempat: "+se.Luas());
//         System.out.println("Keliling segiempat: "+se.Keliling());
//         System.out.println();
   }
    
}

// package praktikum10_salsabilajuandira;
// public class BangunDatar {
//     private String warna;

//     public BangunDatar(String warna) {
//         this.warna = warna;
//     }
//     public BangunDatar(){
        
//     }
//     public String getWarna() {
//         return warna;
//     }

//     public void setWarna(String warna) {
//         this.warna = warna;
//     }
    
//     public double Luas(){
//         return 0;
//     }
//     public double Keliling(){
//         return 0;
//     }
// }
 
// package praktikum10_salsabilajuandira;

// /**
//  *
//  * @author Praktikan
//  */
// public class Lingkaran extends BangunDatar {
//     private double jari;
//     public Lingkaran(String warna, double jari) {
//         super(warna);
//         this.jari= jari;
//     }    
//     public Lingkaran(){}    
//     public void setJari(){
//         this.jari= jari;
//     }
//     public double getJari(){
//         return jari;
//     }
//     public double Luas(){
//         return Math.PI*jari*jari;
//     }
//     public double Keliling(){
//         return 2*Math.PI*jari;
//     }
// }

// package praktikum10_salsabilajuandira;
// public class SegiTiga extends BangunDatar {
//     private double alas;
//     private double tinggi;
    
//     public SegiTiga(String warna, double alas, double tinggi){
//         super(warna);
//         this.alas= alas;
//         this.tinggi= tinggi;        
//     }

//     public double getAlas() {
//         return alas;
//     }

//     public void setAlas(double alas) {
//         this.alas = alas;
//     }

//     public double getTinggi() {
//         return tinggi;
//     }

//     public void setTinggi(double tinggi) {
//         this.tinggi = tinggi;
//     }
//     @Override
//     public double Luas(){
//         return alas*tinggi/2;
//     }
  
//     @Override
//     public double Keliling(){
//         return 3*alas;
//     }
// }


