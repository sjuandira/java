
package com.mycompany.daftarsekolah;

import java.util.Scanner;
import static javafx.scene.input.KeyCode.Y;

/**
 *
 * @author jeni blekping
 *
 */
public class DaftarSekolah {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
//        System.out.print("Nama Sekolah: ");
//        String nama= input.nextLine();
//        System.out.print("Jenjang: ");
//        String jenjang= input.nextLine();
//        System.out.print("Jumlah siswa: ");
//        int js= input.nextInt();
//        System.out.print("Jumlah siswa baru: ");
//        int news= input.nextInt();
//        
//        Sekolah sekolah= new Sekolah(nama,jenjang, js);
//        sekolah.setnamasekolah(nama);
//        System.out.println("Nama sekolah: "+sekolah.getnamasekolah());//untuk ngambil nilai 
//        sekolah.setJenjang(jenjang);
//        System.out.println("Jenjang: "+sekolah.getJenjang());
//        sekolah.setJs(js);
//        System.out.println("Jumlah siswa: "+sekolah.getJs());
//        sekolah.tambahSiswa(news);
//        System.out.println("Update jumlah siswa: "+sekolah.getJs());
        
        System.out.println("\n");
        System.out.print("Nama: ");
        String name= input.nextLine();
        System.out.print("Umur: ");
        int umur= input.nextInt();
        System.out.print("Jenis Kelamin: ");
        String jk= input.nextLine();
        
        System.out.print("Tanggal Lahir: ");
        String tl= input.nextLine();
        
       
        
        
        System.out.println("\n");
        WargaSekolah wargasekolah = new WargaSekolah(name,umur,jk,tl);
        wargasekolah.setName(name);
        System.out.println("Nama: "+wargasekolah.getName());
        wargasekolah.setUmur(umur);
        System.out.println("Umur: "+wargasekolah.getUmur());
        wargasekolah.setJk(jk);
        System.out.println("Jenis Kelamin: "+wargasekolah.getJk());
        wargasekolah.setTl(tl);
        System.out.println("Tanggal Lahir: "+wargasekolah.getTl());
        
}
}
