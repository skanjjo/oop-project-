public class KargoTest {
    public static void main (String[] args){
        SabitDegerler.kdvBilgisiYazdir();

        StandartKargo standart = new StandartKargo (5.5);
        HizliKargo hizli = new HizliKargo (3.0, 150);
         
        System.out.println("-----Standart Kargo Bilgileri-----");
        standart.kargoBilgisiYazdir();
        System.out.println("Toplam Ucret (KDV Dahil) : "+standart.ucretHesapla()+" TL");

        System.out.println("-----Hizli Kargo Bilgileri-----");
        hizli.kargoBilgisiYazdir();
        System.out.println("Toplam Ucret (KDV Dahil) : "+hizli.ucretHesapla()+" TL");

        System.out.println("\n--upcasting  Uygulaması---");
        Kargo kargoRef = hizli;
        kargoRef.kargoBilgisiYazdir();
        System.out.println( "Referans ucret : "+ kargoRef.ucretHesapla());
        System.out.println(" --downcasting Uygulaması---");
        if (kargoRef instanceof HizliKargo){
            HizliKargo hizliKargoRef = (HizliKargo) kargoRef;
            hizliKargoRef.hizliTeslşmatBilgisi();
        }
    }
    
}
