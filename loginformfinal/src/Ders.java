import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Ders implements Serializable {
    private String dersAd;
    private String dersKredi;
    private String dersDonem;

    public Ders(String dersAd, String dersKredi) {
        this.dersAd = dersAd;
        this.dersKredi = dersKredi;
    }
    public String getDersAd() {
        return dersAd;
    }
    public void setDersAd(String dersAd) {
        this.dersAd = dersAd;
    }
    public String getDersKredi() {
        return dersKredi;
    }
    public void setDersKredi(String dersKredi) {
        this.dersKredi = dersKredi;
    }
    public String getDersDonem() {
        return dersDonem;
    }
    public void setDersDonem(String dersDonem) {
        this.dersDonem = dersDonem;
    }

    public static void main(String[] args) {
        List<OgretimGorevlisi> ogretimGorevlisiListesi = ozelOgretimGorevlisiListesiOlustur();

        List<Ders> ozelDersListesi = ozelDersListesiOlustur();

        for (OgretimGorevlisi ogretimGorevlisi : ogretimGorevlisiListesi) {
            System.out.println("Öğretim Görevlisi Adı: " + ogretimGorevlisi.getAd() + ", Öğretim Görevlisi Soyadı: " +
                    ogretimGorevlisi.getSoyad() + ", Öğretim Görevlisi Bölümü: " + ogretimGorevlisi.getBolum());
        }

        for (Ders ders : ozelDersListesi) {
            System.out.println("Ders Adı :" + ders.getDersAd() + ", Ders Kredisi: " + ders.getDersKredi() + ", Ders Dönemi: " + ders.getDersDonem());
        }
    }

    public static List<OgretimGorevlisi> ozelOgretimGorevlisiListesiOlustur() {
        List<OgretimGorevlisi> ogretimGorevlisiListesi = new ArrayList<>();

        OgretimGorevlisi ogretimGorevlisi1 = new OgretimGorevlisi("Ahmet", "Yılmaz", "Bilgisayar Mühendisliği");
        OgretimGorevlisi ogretimGorevlisi2 = new OgretimGorevlisi("Ayşe", "Demir", "Elektrik Mühendisliği");
        OgretimGorevlisi ogretimGorevlisi3 = new OgretimGorevlisi("Mustafa", "Aydın", "Makine Mühendisliği");
        OgretimGorevlisi ogretimGorevlisi4 = new OgretimGorevlisi("Zeynep", "Kara", "Fransızca");

        ogretimGorevlisiListesi.add(ogretimGorevlisi1);
        ogretimGorevlisiListesi.add(ogretimGorevlisi2);
        ogretimGorevlisiListesi.add(ogretimGorevlisi3);
        ogretimGorevlisiListesi.add(ogretimGorevlisi4);

        return ogretimGorevlisiListesi;
    }
    public static List<Ders> ozelDersListesiOlustur() {
        List<Ders> dersListesi = new ArrayList<>();

        Ders ders1 = new Ders("İşletim Sistemleri", "5");
        ders1.setDersDonem("Bahar");

        Ders ders2 = new Ders("Görsel Programlama", "4");
        ders2.setDersDonem("Güz");

        Ders ders3 = new Ders("Nesneye Dayalı Programlama", "3");
        ders3.setDersDonem("Yaz");

        Ders ders4 = new Ders("Fransızca", "2");
        ders1.setDersDonem("Güz");

        dersListesi.add(ders1);
        dersListesi.add(ders2);
        dersListesi.add(ders3);
        dersListesi.add(ders4);

        return dersListesi;
    }
}