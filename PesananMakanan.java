import java.util.Scanner;
public class PesananMakanan{
  public static void main(String[] args){
  Scanner input= new Scanner(System.in);
  int rest;
  do{
    System.out.println("==Program Pemesanan Makanan");
    int j=0;
    String[] restaurant= {"1. Sushi Hokage","2. Ramen Yeah!","3. Keluar"};
    while(j<3){
      System.out.println(restaurant[j]);
      j++;
    }
    System.out.print("Masukan pilihan kamu: ");
    rest= input.nextInt();
    
    if(rest==1){
      System.out.println("\n====Menu Makanan====");
      String[] menu={"1. Tuna salad sushi","2. Sashimi"};
      for(int i=0; i<menu.length; i++){
        System.out.println(menu[i]);
      }
      System.out.print("Masukan pesanan kamu: ");
      int makanan= input.nextInt();
      
      if(makanan==1){
        System.out.print("Masukan jumlah pesanan kamu: ");
        int jPesanan= input.nextInt();
        int harga= jPesanan*50000;
        System.out.println("Pesanan\t\t\tJumlah\tHarga");
        Sytem.out.println("Tuna salad sushi\t"+jPesanan+"\t"+harga);
      }
    }
  
  
  
  }
}
