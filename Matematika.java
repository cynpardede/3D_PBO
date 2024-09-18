/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Matematika {
    public int pertambahan(int a, int b){
      return a+b;  
    }
    public int pengurangan(int a, int b){
        return a-b; 
    }
    public int perkalian(int a, int b){
        return a*b; 
    } 
    public int pembagian(int a,int b){ 
        if (b != 0){//pengkondisian untuk menangani pembagi sama dengan 0
             return a/b;
        }
        System.out.println("Pembagi tidak boleh sama dengan 0");//jika pembagi 0 akan menampilkan output
        return 0;
    }
}