package HotelKu;
import java.util.ArrayList;
/**
 *
 * @author Cynthia
 */
public class costumer extends user implements pengguna {
    
    private ArrayList<kamar> kamarDipesan;
    
    public costumer (String namaPengguna, String kataSandi) {
        super (namaPengguna, kataSandi);
        this.kamarDipesan = new ArrayList<>();
    }
    
    @Override
    public void lihatBooking() {
        if (kamarDipesan.isEmpty()) {
            System.out.println ("Hai " + getNamaPengguna() + ", Anda belum Memesan Kamar untuk Saat Ini.");
        } else {
            System.out.println ("Hai " + getNamaPengguna() + ", Anda telah Memesan Kamar berikut :");
            for (Kamar kamar : kamarDipesan) {
                kamar.detailKamar();
            }
        }
    }
    
    @Override
    public void pesanKamar (kamar Kamar) {
        if (kamar.isTersedia()) {
            kamar.pesanKamar();
            kamarDipesan.add(kamar);
            System.out.println ("Hai " + getNamaPengguna() + ", Anda berhasil Memesan Kamar " + kamar.getNomorKamar());
        } else {
            System.out.println ("Hai " + getNamaPengguna() + ", Kamar " + kamar.getNomorKamar() + "tidak tersedia.");
        }
            }
    
    @Override
    public void batalkanBooking (kamar Kamar) {
        if (kamarDipesan.contains(kamar)) {
            kamar.batalkanBooking();
            kamarDipesan.remove(kamar);
            System.out.println ("Hai " + getNamaPengguna() + ", Anda berhasil Membatalkan Reservasi.");
        } else {
            System.out.println ("Anda belum Memesan Kamar ini.");
        }
    }
}