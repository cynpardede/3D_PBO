/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasP5.SoalNo2;
import java.util.Scanner;
/**
 *
 * @author Cynthia
 */
public class DiskonPembelian {

     public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Total Pembelian     = Rp.");
        double tbelanja = inp.nextDouble();

        double diskon = 0;

        if (tbelanja < 50000 && tbelanja > 0){
            diskon = 0.05;
        }
        else {
            diskon = 0.20;
        }

        double potongan = tbelanja * diskon;
        double hargafinal = tbelanja - potongan;

        System.out.println("Besarnya Potongan   = Rp."+potongan);
        System.out.println("___________________________________________");
        System.out.println("Jumlah yang harus dibayar   = Rp."+hargafinal);

    }
}