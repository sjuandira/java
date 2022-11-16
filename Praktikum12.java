/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum12_salsabilajuandira;

/**
 *
 * @author Praktikan
 */
public class Praktikum12_SalsabilaJuandira {

    /**
     * @param args the command line arguments
     */
    static void checkAge(int age){
            if(age<18){
                throw new ArithmeticException("Akses ditolak");
            }else{
                System.out.println("Akses Diberikan!");
            }
        }
    public static void main(String[] args) {
//        try{
//            int[] num= {1,2,3};
//            System.out.println(num[10]);           
//        }
//        catch(Exception e){
//            System.out.println("Terjadi error");            
//        }
//        finally{
//            System.out.println("Blok kode finally");
//        }
        checkAge(25);
    }
    
}
