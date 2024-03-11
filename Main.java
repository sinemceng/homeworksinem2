public class Main {
    public static void main(String[] args) {
        Ogrenci ogrenci1=new Ogrenci("Sinem Özdemir","Bilgisayar Mühendisliği",3.4,"145",2018);
        Ogrenci ogrenci2= new Ogrenci("Lale Gül","Moda Tasarım",1.2,"145",2021);
        Ogrenci ogrenci3= new Ogrenci("Enes Yan","Makine Mühendisliği",3.5,"145",2020);
        Ogrenci ogrenci4= new Ogrenci("Baran Özen","Acil Tıp Teknisyeni",2.4,"145",2019);

        Ogrenci ogrenci5= new Ogrenci();

        ogrenci1.ganoDistance(ogrenci1.getGano());
        ogrenci2.ganoDistance(ogrenci2.getGano());
        ogrenci3.ganoDistance(ogrenci3.getGano());
        ogrenci4.ganoDistance(ogrenci4.getGano());

        System.out.println("ogr-1: " + ogrenci5.getAd()+ " , " + ogrenci5.getBolum() +" , "+ ogrenci1.ogrenciNoOlustur() + " , "+ ogrenci1.getGano());
        System.out.println("ogr-2: " + ogrenci2.getAd()+ " , " + ogrenci2.getBolum() +" , "+ ogrenci2.ogrenciNoOlustur() + " , "+ ogrenci2.getGano());
        System.out.println("ogr-3: " + ogrenci3.getAd()+ " , " + ogrenci3.getBolum() +" , "+ ogrenci3.ogrenciNoOlustur() + " , "+ ogrenci3.getGano());
        System.out.println("ogr-4: " + ogrenci4.getAd()+ " , " + ogrenci4.getBolum() +" , "+ ogrenci4.ogrenciNoOlustur() + " , "+ ogrenci4.getGano());

        System.out.println("3.öğrencinin ödeyeceği harç miktarı: "+ ogrenci3.harcHesapla(30,2));
        System.out.println("4.öğrencinin ödeyeceği harçmiktarı: "+ogrenci4.harcHesapla(30,3));



    }
}