/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author USER
 */
public class MatematikaInheritance {
    
    public static void main(String[] args) {
      Matematika2 hitung = new Matematika2();
        
        System.out.println("================================");//Heading Program
        System.out.println("\tOPERASI MATEMATIKA 2");
        System.out.println("================================");
        System.out.println(" Nilai a : 25");
        System.out.println(" Nilai b : 10");
     
        int hasilTambah = hitung.pertambahan(25, 10);
        System.out.println(" Hasil Pertambahan : " + hasilTambah);
       
        int hasilKurang = hitung.pengurangan(25, 10);
        System.out.println(" Hasil Pengurangan : " + hasilKurang);
        
        int hasilKali = hitung.perkalian(25, 10);
        System.out.println(" Hasil Perkalian : " + hasilKali);
        
        int hasilBagi = hitung.pembagian(25, 10);
        System.out.println(" Hasil Pembagian : " + hasilBagi);
        
        int hasilModulus = hitung.modulus(25, 10);
        System.out.println(" Hasil Modulus : " + hasilModulus);
    }
}