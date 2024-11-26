/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasP9;

/**
 *
 * @author Cynthia
 */
public class PenghitungHari {
 public int hitung(int tahun, String bulan){
    int jumlahHari;
    bulan = bulan.toLowerCase();
    
    if(bulan.equals("januari") || bulan.equals("maret") || bulan.equals("mei") || 
            bulan.equals("juli") || bulan.equals("agustus") || bulan.equals("oktober") || bulan.equals("desember")){
        jumlahHari = 31;
    }
    else if (bulan.equals("april") || bulan.equals("juni") || bulan.equals("september") || bulan.equals("november")) {
            jumlahHari = 30;
    }
    else if (bulan.equals("februari")) {
        if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
            jumlahHari = 29;
        } 
        else {
            jumlahHari = 28;
        }
    }
    else {
        jumlahHari = 0;
    }
    
    return jumlahHari;
    }
}