public class OtelTest {
    public static void main(String[]args ){
        Rezervasyon r1 = new Rezervasyon("Mehmet can ","2025-06-15",2);
        r1.rezervasyonYap();
        r1.bilgiYazdir();
        r1.rezervasyonIptal();

        System.out.println("---------------");
        OtelRezervasyonu or1 = new OtelRezervasyonu("Ayse nur","2025-07-20",3,OdaTipi.DELUXE,2,true);
        or1.rezervasyonYap();
        or1.bilgiYazdir();
        System.out.println("Toplam Ücret: " + or1.toplamUcretHesapla() + " TL");
        or1.rezervasyonIptal();

        System.out.println("---------------");
        OtelRezervasyonu or2 = new OtelRezervasyonu("Ali veli","2025-08-10",2,OdaTipi.SUIT,1,false);
        or2.rezervasyonYap();
        or2.bilgiYazdir();
        System.out.println("Toplam Ücret: " + or2.toplamUcretHesapla() + " TL");
        or2.rezervasyonIptal();

    }

}