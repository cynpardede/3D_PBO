/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasP8;
import java.util.Scanner;
/**
 *
 * @author Cynthia
 */
public class TokoDede {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("TOKO SERBA ADA");
        System.out.println("======================");
        System.out.print("Masukkan Jumlah Item: ");
        int jumlahItem = input.nextInt();
        
        String[] kodeBarang = new String[jumlahItem];
        String[] namaBarang = new String[jumlahItem];
        int[] hargaBarang = new int[jumlahItem];
        int[] jumlahBeli = new int[jumlahItem];
        int[] jumlahBayar = new int[jumlahItem];
        int totalBayar = 0;

        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("Data ke " + (i + 1));
            System.out.print("Masukkan Kode Barang: ");
            kodeBarang[i] = input.next();
            
            System.out.print("Masukkan jumlah Beli: ");
            jumlahBeli[i] = input.nextInt();

            switch (kodeBarang[i]) {
                case "a001":
                    namaBarang[i] = "Buku";
                    hargaBarang[i] = 3000;
                    break;
                case "a002":
                    namaBarang[i] = "Pensil";
                    hargaBarang[i] = 2000;
                    break;
                case "a003":
                    namaBarang[i] = "Pulpen";
                    hargaBarang[i] = 5000;
                    break;
                default:
                    namaBarang[i] = "???";
                    hargaBarang[i] = 0;
                    break;
            }
            
            jumlahBayar[i] = hargaBarang[i] * jumlahBeli[i];
            totalBayar += jumlahBayar[i];
        }

        System.out.println("\nTOKO SERBA ADA");
        System.out.println("=======================================================================");
        System.out.printf("%-4s %-14s %-14s %-8s %-14s %-14s%n", "No", "Kode Barang", "Nama Barang", "Harga", "Jumlah Beli", "Jumlah Bayar");

        for (int i = 0; i < jumlahItem; i++) {
            System.out.printf("%-4d %-14s %-14s %-8d %-14d %-14d%n", (i + 1), kodeBarang[i], namaBarang[i], hargaBarang[i], jumlahBeli[i], jumlahBayar[i]);
        }

        System.out.println("_______________________________________________________________________");
        System.out.println("Total Bayar\t\t\t\t\t\t   " + totalBayar);
        System.out.println("=======================================================================");

        input.close();
    }
}