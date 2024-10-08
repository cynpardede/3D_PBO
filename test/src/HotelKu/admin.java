package HotelKu;
import java.util.ArrayList;
/**
 *
 * @author Cynthia
 */
public class admin extends user implements pengguna {
    private ArrayList <kamar> Kamarku;
    
    public admin (String namaPengguna, String kataSandi, ArrayList <kamar> Kamarku) {
        super (namaPengguna, kataSandi);
        this.Kamarku = Kamarku;
    }
   
    @Override
    public void lihatBooking() {
        System.out.println ("Admin " + getNamaPengguna() + " Melihat Semua Reservasi.");
        for (kamar Kamar : Kamarku) {
            kamar.detailKamar();
        }
    }
    
    @Override
    public void pesanKamar(kamar Kamar) {
        kamar.pesanKamar();
        System.out.println ("Admin Memesan Kamar " + kamar.getNomorKamar());
    }

    @Override
    public void batalkanBooking(kamar Kamar) {
        kamar.batalkanBooking();
        System.out.println ("Admin Membatalkan Reservasi untuk Kamar " + kamar.getNomorKamar());
    }
     
    public void tambahKamar (kamar Kamar) {
        Kamarku.add (kamar);
        System.out.println ("Kamar " + kamar.getNomorKamar() + " Telah Ditambahkan.");
    }
    
    public void lihatKamarTersedia() {
        System.out.println ("Kamar yang tersedia: ");
        for (kamar Kamar : Kamarku) {
            if (kamar.isTersedia()) {
                kamar.detailKamar();
            }
        }
    }   
}