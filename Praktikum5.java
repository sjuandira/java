public class Praktikum5{
  public static void main(String[] args){
    Mahasiswa mhs1= new Mahasiswa();
    mhs1.nama="Salsabila Juandira";
    mhs1.npm="2117051012";
    
    mhs1.insertNilaiUas(80);
    mhs1.insertNilaiUts(78);
    
    mhs1.dataMhs();
    System.out.println("Nilai akhir: "+mhs1.nilaiAkhir());
  }
}
