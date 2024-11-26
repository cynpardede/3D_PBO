/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasP9;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
/**
 *
 * @author Cynthia
 */
public class PenentuJumlahHariextends javax.swing.JFrame {

    public PenentuJumlahHari() {
        setTitle("Aplikasi Penentu jumlah Hari GUI Java");
        initComponents();
    }
    @SuppressWarnings("unchecked")

    private void BTKeluarActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }
    private void BTHitungActionPerformed(java.awt.event.ActionEvent evt) {
        int tahun = Integer.parseInt(TFTahun.getText());
        String bulan = CBBulan.getSelectedItem().toString();
        PenghitungHari ph = new PenghitungHari();
        int jumlahHari = ph.hitung(tahun, bulan);
        TXTresult.setText("Jumlah Hari Pada Bulan " + bulan + " Tahun " + tahun + " Adalah " + jumlahHari);
    }
    private void CBBulanActionPerformed(java.awt.event.ActionEvent evt) {
    }//GEN-LAST:event_CBBulanActionPerformed

    private void BTSimpanActionPerformed(java.awt.event.ActionEvent evt) {    String hasil = TXTresult.getText();
    try (FileWriter writer = new FileWriter("result.txt")) {
        writer.write(hasil);
        JOptionPane.showMessageDialog(this, "hasil telah disimpan di result.txt");
        }
    catch (IOException e){
        JOptionPane.showMessageDialog(this, "Error : " + e.getMessage());
        }
    }
    private void BTHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTHapusActionPerformed
        TFTahun.setText("");
        CBBulan.setSelectedItem("-pilih bulan-");
        TXTresult.setText("Terhapus!");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PenentuJumlahHari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenentuJumlahHari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenentuJumlahHari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenentuJumlahHari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PenentuJumlahHari().setVisible(true);
            }
        });
    }
    private javax.swing.JButton BTHapus;
    private javax.swing.JButton BTHitung;
    private javax.swing.JButton BTKeluar;
    private javax.swing.JButton BTSimpan;
    private javax.swing.JComboBox<String> CBBulan;
    private javax.swing.JTextField TFTahun;
    private javax.swing.JLabel TXTresult;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
}