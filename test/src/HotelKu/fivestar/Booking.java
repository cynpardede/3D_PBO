/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HotelKu.fivestar;
import java.util.Scanner;
/**
 *
 * @author NaufalRaf
 */
public class Booking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String namaHotel = "D'sinpard Hotel";
        
        System.out.println ("A warm welcome to you, beloved guest, at " + namaHotel + "!");
        
        ArrayList<kamar> kamarku = new ArrayList<>();
        kamarku.add (new kamar (111, "Standar", true, 150000));
        kamarku.add (new kamar (222, "VIP", true, 250000));
        kamarku.add (new kamar (333, "VVIP", true, 500000));
        kamarku.add (new kamar (444, "Suite", true, 2000000));
        kamarku.add (new kamar (555, "Deluxe", true, 3000000));
        
        costumer costumer = new costumer ("Bartholomeus", "12345");
        admin admin = new admin ("Dede", "adminpass", kamarku);
        
        int pilihan;
        
        do {
            System.out.println("\n=== Menu Reservasi Dirfavs Hotel ===");
            System.out.println("1. Lihat Kamar yang Tersedia");
            System.out.println("2. Pesan Kamar");
            System.out.println("3. Batalkan Reservasi");
            System.out.println("4. Lihat Reservasi Anda");
            System.out.println("5. Admin - Lihat Semua Kamar");
            System.out.println("6. Admin - Tambah Kamar");
            System.out.println("0. Keluar");
            System.out.print("Pilih opsi: ");
            Scanner scanner = new Scanner(System.in);
            pilihan = scanner.nextInt();
            
        switch (pilihan) {
            case 1:
                Admin.lihatKamarTersedia();
                break;
            case 2:
                System.out.println ("Masukkan Nomor Kamar yang ingin dipesan: ");
                int nomorKamar = scanner.nextInt();
                kamar kamarTerpilih = kamarku.stream()
                        .filter(kamar -> nomorKamar == kamar.getNomorKamar())
                        .findFirst()
                        .orElse(null);
                
                if (kamarTerpilih != null) {
                    costumer.pesanKamar(kamarTerpilih);
                } else {
                    System.out.println ("Kamar tidak Ditemukan.");
                }
                break;
            case 3:
                System.out.println ("Masukkan Nomor Kamar untuk Membatalkan Booking: ");
                int nomorKamarBatal = scanner.nextInt();
                kamar kamarBatal = kamarku.stream()
                        .filter(kamar -> nomorKamarBatal == kamar.getNomorKamar())
                        .findFirst()
                        .orElse(null);
                if (kamarBatal != null) {
                    costumer.batalkanBooking(kamarBatal);
                } else {
                    System.out.println ("Kamar Tidak Ditemukan.");
                }
                break;
            case 4:
                costumer.lihatBookingan();
                break;
            case 5:
                Admin.lihatBookingan();
                break;
            case 6: 
                 System.out.print("Masukkan nomor kamar baru: ");
                    int nomorKamarBaru = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Masukkan tipe kamar baru: ");
                    String tipeKamarBaru = scanner.nextLine();
                    System.out.print("Apakah kamar ini tersedia (Ya/Tidak): ");
                    String inputKetersediaan = scanner.nextLine();
                    boolean ketersediaanBaru = inputKetersediaan.equalsIgnoreCase("Ya");
                    System.out.print("Masukkan harga kamar baru: ");
                    double hargaBaru = scanner.nextDouble();

                    kamar kamarBaru = new kamar(nomorKamarBaru, tipeKamarBaru, ketersediaanBaru, hargaBaru);
                    Admin.tambahkamar(kamarBaru);
                    break;
            case 0:
                System.out.println ("Terima Kasih sudah menggunakan layanan kami :)");
                break;
            default:
                System.out.println ("Pilihan tidak valid, Try again!");
                break;         
        }
    } while (pilihan !=0);
        
    System.out.println ("Have a Nice Day! Hope to See You again in D'sinpard Hotel!");     
    }   
}