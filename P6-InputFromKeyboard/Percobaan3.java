import javax.swing.JOptionPane;
public class Percobaan3 {
    public static void main(String[] args) {
        String nama, nim, tmpt, tgl;
        nama = JOptionPane.showInputDialog("Masukkan nama anda : ");
        nim = JOptionPane.showInputDialog("Masukkan nim anda : ");
        tmpt = JOptionPane.showInputDialog("Masukkan tempat lahir anda : ");
        tgl = JOptionPane.showInputDialog("Masukkan tanggal lahir anda : ");
        String msg = "Hello "+ nama + "!\nnim : "+nim+"\nTempat lahir : "+tmpt+"\nTanggal lahir : "+tgl;
        JOptionPane.showMessageDialog(null, msg);
    }
}