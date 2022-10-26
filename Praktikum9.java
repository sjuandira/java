package praktikum9_salsabilajuandira;
public class Praktikum9_SalsabilaJuandira {
//    public String atributBukanStatic="Atribut Bukan Static";
//    static String atributStatic="Atribut Static";
//    public void bukanStatic(){
//        System.out.println("Bukan Method Static");
//    }
//    static void methodStatic(){
//        System.out.println("Method Static");
//    }
public static class Tabung {
    private static final double phi= Math.PI;
    
    public static double volume(double r, double t){
        double volume= phi*r*r*t;        
        return volume;
    }
    public static double luasPermukaan(double r, double t){
        double luasPermukaan= 2*phi*r*(r+t);        
        return luasPermukaan;
    }
}    
    
    public static void main(String[] args) {
//        Praktikum9_SalsabilaJuandira praktikum=new Praktikum9_SalsabilaJuandira();
//        System.out.println(praktikum.atributBukanStatic);
//        System.out.println(praktikum.atributStatic);
//        
//        praktikum.bukanStatic();
//        methodStatic();
        double r=13;
        double t=30;
        double vol=Tabung.volume(r, t);
        double lp= Tabung.luasPermukaan(r, t);
        
        System.out.println(vol);
        System.out.println(lp);
    }
}
