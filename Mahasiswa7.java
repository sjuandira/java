package praktikum7;
import java.util.Arrays;
import java.util.Scanner;
public class Mahasiswa7 {
    private String nama;
    private String npm;
    private double nilaiTugas;
    private double nilaiUts;
    private double nilaiUas;
    private double NA;
    
    public void printData(String jurusan){
        System.out.println("Nama: "+this.nama);
        System.out.println("NPM: "+this.npm);
        System.out.println("Jurusan: "+jurusan);
        System.out.println("Nilai Tugas: "+this.nilaiTugas);
        System.out.println("Nilai UTS: "+this.nilaiUts);
        System.out.println("Nilai UAS: "+this.nilaiUas);
    }
    
    public double nilaiAkhir(){
       return (nilaiTugas+nilaiUts+nilaiUas)/3;
    }
    public Mahasiswa7(String nama, String npm, double nilaiTugas, double nilaiUts, double nilaiUas){
        this.nama=nama;
        this.npm=npm;
        this.nilaiTugas=nilaiTugas;
        this.nilaiUts=nilaiUts;
        this.nilaiUas=nilaiUas;
    }
    public void setNama(){
        this.nama= nama;
    }
    public String getNama(){
        return nama;
    }
    public void setNpm(){
        this.npm= npm;
    }
    public String getNpm(){
        return npm;
    }
    public void setNilaiTugas(){
        this.nilaiTugas= nilaiTugas;
    }
    public double getNilaiTugas(){
        return nilaiTugas;
    }
    public void setNilaiUts(){
        this.nilaiUts= nilaiUts;
    }
    public double getNilaiUts(){
        return nilaiUts;
    }
    public void setNilaiUas(){
        this.nilaiUas= nilaiUas;
    }
    public double getNilaiUas(){
        return nilaiUas;
    }
}
