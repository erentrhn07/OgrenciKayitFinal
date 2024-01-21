import java.util.ArrayList;
import java.util.List;

public class Ogrenci {
    private String ogrenciAd;
    private String ogrenciSoyad;
    private int ogrenciNo;
    private String ogrenciBolum;
    private List<Ders> ogrenciDers;
    private List<OgretimGorevlisi> ogretimGorevlisi;

    public Ogrenci(String ogrenciAd, String ogrenciSoyad, String ogrenciBolum, int ogrenciNo, List<Ders> ogrenciDers, List<OgretimGorevlisi> ogretimGorevlisi){
        this.ogrenciAd = ogrenciAd;
        this.ogrenciSoyad = ogrenciSoyad;
        this.ogrenciBolum = ogrenciBolum;
        this.ogrenciNo = ogrenciNo;
        this.ogrenciDers = ogrenciDers;
        this.ogretimGorevlisi = ogretimGorevlisi;
    }

    public String getOgrenciAd() {
        return ogrenciAd;
    }

    public void setOgrenciAd(String ogrenciAd) {
        this.ogrenciAd = ogrenciAd;
    }

    public String getOgrenciSoyad() {
        return ogrenciSoyad;
    }

    public void setOgrenciSoyad(String ogrenciSoyad) {
        this.ogrenciSoyad = ogrenciSoyad;
    }

    public String getOgrenciBolum() {
        return ogrenciAd;
    }

    public void setOgrenciBolum(String ogrenciBolum) {
        this.ogrenciBolum = ogrenciBolum;
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public List<Ders> getOgrenciDers() {
        return ogrenciDers;
    }

    public void setOgrenciDers(List<Ders> ogrenciDers) {
        this.ogrenciDers = ogrenciDers;
    }

    public List<OgretimGorevlisi> getOgretimGorevlisi() {
        return ogretimGorevlisi;
    }
    public void setOgretimGorevlisi(List<OgretimGorevlisi> ogretimGorevlisi) {
        this.ogretimGorevlisi = ogretimGorevlisi;
    }
}
