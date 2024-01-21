import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class OgretimGorevlisi implements Serializable {
    private String ad;
    private String soyad;
    private String bolum;

    public OgretimGorevlisi(String ad, String soyad, String bolum) {
        this.ad = ad;
        this.soyad = soyad;
        this.bolum = bolum;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public static void main(String[] args) {
        List<OgretimGorevlisi> ogretimGorevlisiListesi = ogretimGorevlisiListesiOlustur();

        for (OgretimGorevlisi ogretimGorevlisi : ogretimGorevlisiListesi) {
            System.out.println("Öğretim Görevlisi Adı: " + ogretimGorevlisi.getAd() + ", Öğretim Görevlisi Soyadı: " +
                    ogretimGorevlisi.getSoyad() + ", Öğretim Görevlisi Bölümü: " + ogretimGorevlisi.getBolum());
        }
    }

    public static List<OgretimGorevlisi> ogretimGorevlisiListesiOlustur() {
        List<OgretimGorevlisi> ogretimGorevlisiListesi = new ArrayList<>();

        OgretimGorevlisi ogretimGorevlisi1 = new OgretimGorevlisi("Pınar", "Çiçek", "İşletim Sistemleri");
        OgretimGorevlisi ogretimGorevlisi2 = new OgretimGorevlisi("Şehmuz", "Aydın", "Nesneye Dayalı Programlama");
        OgretimGorevlisi ogretimGorevlisi3 = new OgretimGorevlisi("Cemal", "Korkmaz", "Görsel Programlama");
        OgretimGorevlisi ogretimGorevlisi4 = new OgretimGorevlisi("Fatih", "Ünal", "Fransızca");

        ogretimGorevlisiListesi.add(ogretimGorevlisi1);
        ogretimGorevlisiListesi.add(ogretimGorevlisi2);
        ogretimGorevlisiListesi.add(ogretimGorevlisi3);
        ogretimGorevlisiListesi.add(ogretimGorevlisi4);

        return ogretimGorevlisiListesi;
    }
}