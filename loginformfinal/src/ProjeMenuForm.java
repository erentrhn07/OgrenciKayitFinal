import javax.swing.*;
import java.awt.*;

public class ProjeMenuForm extends JFrame {
    private JLabel ogrencikayit;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;

    public ProjeMenuForm() {
        JButton dersKayitButton = new JButton("Ders Kayıt Formu");
        dersKayitButton.addActionListener(e -> {
            DersKayitForm dersKayitForm = new DersKayitForm();
            dersKayitForm.setVisible(true);
        });

        JButton ogrenciKayitButton = new JButton("Öğrenci Kayıt Formu");
        ogrenciKayitButton.addActionListener(e -> {
            OgrenciKayitForm ogrenciKayitForm = new OgrenciKayitForm();
            ogrenciKayitForm.setVisible(true);
        });

        JButton ogretimGorevlisiKayitButton = new JButton("Öğretim Görevlisi Kayıt Formu");
        ogrenciKayitButton.addActionListener(e -> {
            OgretimGorevlisiForm ogretimGorevlisiForm = new OgretimGorevlisiForm();
            ogretimGorevlisiForm.setVisible(true);
        });

        JPanel panel = new JPanel(new GridLayout(3, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel.add(dersKayitButton);
        panel.add(ogrenciKayitButton);
        panel.add(ogretimGorevlisiKayitButton);

        add(panel);
        setSize(300, 200);
        setTitle("Proje Menü Formu");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ProjeMenuForm projeMenuForm = new ProjeMenuForm();
        });
    }
}

