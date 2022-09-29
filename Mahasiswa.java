//untuk praktikum 5
public class Mahasiswa{
  public String nama;
  public String npm;
  private double nilaiUas;
  private double nilaiUts;
  
  public void insertNilaiUas(double nilai){
    nilaiUas= nilai;
  }
  public void insertNilaiUts(double nilai){
    nilaiUts= nilai;
  }
  public void dataMhs(){
    System.out.println("Nama: "+nama);
    System.out.println("NPM: "+npm);
    System.out.println("Nilai UAS: "+nilaiUas);
    System.out.println("Nilai UTS: "+nilaiUts);    
  }
  public double nilaiAkhir(){
    double nilaiAkhir= nilaiUts+nilaiUas;
    return jumlah/2;
  }

}
