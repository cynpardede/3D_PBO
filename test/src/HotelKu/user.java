package HotelKu;

/**
 *
 * @author Cynthia
 */
abstract class user {
    private String namaPengguna;
    private String kataSandi;
    
    public user (String namaPengguna, String kataSandi) {
        this.namaPengguna = namaPengguna;
        this.kataSandi = kataSandi;
    }
    
    public String getNamaPengguna() {
        return namaPengguna;
    }
}