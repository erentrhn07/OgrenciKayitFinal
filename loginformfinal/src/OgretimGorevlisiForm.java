import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class OgretimGorevlisiForm extends JFrame {
    private JLabel ogelemanıkayit;
    private JTextField ogelemanAd;
    private JTextField ogelemanSoyad;
    private JComboBox ders;
    private JButton kaydetButton;

    public OgretimGorevlisiForm() {
        JLabel AdLabel = new JLabel("Öğretim Görevlisi Adı:");
        JTextField AdField = new JTextField(12);

        JLabel SoyadLabel = new JLabel("Öğretim Görevlisi Soyadı:");
        JTextField SoyadField = new JTextField(12);

        JLabel BolumLabel = new JLabel("Bölüm:");
        String[] bolumler = {"İşletim Sistemleri", "Görsel Programlama", "Nesneye Dayalı Programlama", "Fransızca"};
        JComboBox<String>BolumComboBox = new JComboBox<>(bolumler);

        kaydetButton = new JButton("Kaydet");

        kaydetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String ogretimGorevlisiAd = AdField.getText().trim();
                String ogretimGorevlisiSoyad = SoyadField.getText().trim();
                String bolum = BolumComboBox.getSelectedItem().toString().trim();

                if (ogretimGorevlisiAd.isEmpty() || ogretimGorevlisiSoyad.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Lütfen bilgileri eksiksiz doldurunuz.", "Hata", JOptionPane.ERROR_MESSAGE);
                } else {
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter("ogretim_gorevlileri.csv", true))) {
                        bw.write(ogretimGorevlisiAd + "," + ogretimGorevlisiSoyad + "," + bolum);
                        bw.newLine();
                        System.out.println("Öğretim görevlisi kaydedildi: " + ogretimGorevlisiAd);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.add(AdLabel);
        panel.add(AdField);
        panel.add(SoyadLabel);
        panel.add(SoyadField);
        panel.add(BolumLabel);
        panel.add(BolumComboBox);
        panel.add(new JLabel());
        panel.add(kaydetButton);

        this.add(panel);
        this.setSize(350, 250);
        this.setTitle("Öğretim Görevlisi Kayıt Formu");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new OgretimGorevlisiForm());
    }
}


