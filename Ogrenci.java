public class Ogrenci {
    private String ad;
    private String bolum;
    private double gano;
    public String ogrNo;
    public int girisYili;
    public String bolumKodu="123";
    public String girisSirasi="001";

    public Ogrenci(String ad,String bolum){
        this.ad=ad;
        this.bolum=bolum;
    }
    public Ogrenci(Ogrenci a){
        this.ad=a.ad;
        this.bolum=a.bolum;
        this.gano =a.gano;
        this.ogrNo = a.ogrNo;
        this.girisYili = a.girisYili;

    }
    public Ogrenci(String ad, String bolum, double gano, String ogrNo, int girisYili) {
        this.ad = ad;
        this.bolum = bolum;
        this.gano = gano;
        this.ogrNo = ogrNo;
        this.girisYili = girisYili;
    }

    public Ogrenci() {
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public double getGano() {
        return gano;
    }

    public void setGano(double gano) {
        this.gano = gano;
    }

    public String getOgrNo() {
        return ogrNo;
    }

    public void setOgrNo(String ogrNo) {
        this.ogrNo = ogrNo;
    }

    public int getGirisYili() {
        return girisYili;
    }

    public void setGirisYili(int girisYili) {
        this.girisYili = girisYili;
    }
    public int harcHesapla(int dersSayisi){
        return dersSayisi;
    }
    public double harcHesapla(int ucret,double kalanYil){
        return ucret*kalanYil*harcHesapla(3);
    }
    public String ogrenciNoOlustur(){
        return this.girisYili + this.bolumKodu+this.girisSirasi;
    }
    public void ganoDistance(double gano){
        if(gano<0.0 || gano>4.0){
            throw new IllegalArgumentException("Yanlış gano değeri girilmiştir!!!");
        }
    }

}
