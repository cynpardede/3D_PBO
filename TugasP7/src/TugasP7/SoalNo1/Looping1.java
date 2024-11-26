/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasP7.SoalNo1;
import java.util.Scanner;
/**
 *
 * @author Cynthia
 */
public class Looping1 {

   public static void deretPrima() {
        System.out.println("Bilangan Prima dari 0 - 20:");
        for (int i = 2; i <= 20; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nBilangan Bukan Prima dari 0 - 20:");
        for (int i = 0; i <= 20; i++) {
            if (!isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void deretGanjilGenap() {
        int i = 0;

        System.out.println("Bilangan Ganjil dari 0 - 20:");
        while (i <= 20) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }

        i = 0;
        System.out.println("\nBilangan Genap dari 0 - 20:");
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
    }

    public static void hurufZA() {
        char ch = 'Z';
        System.out.println("Huruf Z - A:");
        do {
            System.out.print(ch + " ");
            ch--;
        } while (ch >= 'A');
        System.out.println();
    }

    public static void laguAnakAyam() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah anak ayam: ");
        int n = scanner.nextInt();

        for (int i = n; i > 0; i--) {
            if (i == 1) {
                System.out.println("Anak ayam turun " + i + ", mati satu tinggal induknya.");
            } else {
                System.out.println("Anak ayam turun " + i + ", mati satu tinggal " + (i - 1));
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilih program yang ingin dijalankan:");
        System.out.println("1. Deret Bilangan Prima dan Bukan Prima dari 0 - 20");
        System.out.println("2. Deret Bilangan Ganjil dan Genap dari 0 - 20");
        System.out.println("3. Huruf Z - A");
        System.out.println("4. Lagu Anak Ayam Turun N");
        System.out.print("Masukkan pilihan (1-4): ");
        int pilihan = scanner.nextInt();
        
        switch (pilihan) {
            case 1:
                deretPrima();   
                break;
            case 2:
                deretGanjilGenap();  
                break;
            case 3:
                hurufZA();  
                break;
            case 4:
                laguAnakAyam();  
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }
}
    
