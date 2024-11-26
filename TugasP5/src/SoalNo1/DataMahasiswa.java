/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SoalNo1;
import java.util.Scanner;
/**
 *
 * @author Cynthia
 */
public class DataMahasiswa {

    public static void main(String[] args) {
        
        System.out.println("-------------------- Data Mahasiswa --------------------");

        Scanner inp = new Scanner(System.in);

        System.out.print("NPM               : ");
        String npm = inp.nextLine();    

        System.out.print("Nama Mahasiswa    : ");
        String nama = inp.nextLine();

        System.out.print("Nilai Kehadiran   : ");
        double absen = inp.nextDouble();

        System.out.print("Nilai Tugas       : ");
        double tugas = inp.nextDouble();

        System.out.print("Nilai UTS         : ");
        double uts = inp.nextDouble();

        System.out.print("Nilai UAS         : ");
        double uas = inp.nextDouble();
        
        double nilai_rata = (absen + tugas + uts + uas) / 4 ;
        double nilai_akhir = (absen * 0.1) + (tugas * 0.2) + (uts * 0.3) + (uas * 0.4) ;
    
        String grade = "";
        String ket = "";
        if (nilai_akhir <= 100 && nilai_akhir >= 76){
            grade = "A";
            ket = "ISTIMEWA";
        }
        else if (nilai_akhir <= 75 && nilai_akhir >= 66){
            grade = "B";
            ket = "BAIK";
        }
        else if (nilai_akhir <= 65 && nilai_akhir >= 56){
            grade = "C";
            ket = "CUKUP";
        }
        else if (nilai_akhir <= 55 && nilai_akhir >= 46){
            grade = "D";
            ket = "KURANG";
        }
        else if (nilai_akhir <= 45 && nilai_akhir >= 0){
            grade = "E";
            ket = "KURANG SEKALI";
        }
        else {
            grade = "UNDEFINED";
            ket = "UNDEFINED";
            System.out.println("Error input");
        }

        System.out.println("<==================== Hasil Akhir ====================>");
        System.out.println("NPM Mahasiswa   : " + npm);
        System.out.println("Nama Mahasiswa  : " + nama);
        System.out.println("Nilai Rata-rata : " + nilai_rata);
        System.out.println("Nilai Akhir     : " + nilai_akhir);
        System.out.println("Grade           : " + grade );
        System.out.println("Keterangan      : " + ket );
    }
}
