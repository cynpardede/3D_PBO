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
public class Mahasiswa {//membuat class Mahasiswa 
    String nama;//Deklarasi atribut
   
    
    void membaca(){//Fungsi membaca
        System.out.println(this.nama);
        System.out.println("Status : Mahasiswa sedang membaca");
    }
    
    void nyontek(){//Fungsi nyontek
        System.out.println(this.nama);
        System.out.println("Status : Mahasiswa sedang menyontek");
    }
    
    void modifikasi(){//Fungsi modifikasi
        System.out.println(this.nama);
        System.out.println("Status : Mahasiswa sedang memodifikasi tugas");
    }
    
}
