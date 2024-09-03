/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg23130_cynthia.angelina.pardede_tugas3d;

/**
 *
 * @author delia
 */
public class MahasiswaBeraksi {
    
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();//Pembuatan object mahasiswa1 dari class Mahasiswa
        Mahasiswa mahasiswa2 = new Mahasiswa();
        Mahasiswa mahasiswa3 = new Mahasiswa();
        
    
        //pengisian nama mahasiswa
        mahasiswa1.nama = "Cynthia Angelina Pardede";
        
        
        //Pemanggilan ketiga fungsi    
        mahasiswa1.membaca();
        mahasiswa1.nyontek();
        mahasiswa1.modifikasi();
    }
    
}
