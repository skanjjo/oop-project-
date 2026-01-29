public class OdemeTest {
    public static void main(String[]args ){
         KartOdeme kart = new KartOdeme ("Ali Veli",500.0,"1234");
        CevrimiciOdeme  online = new CevrimiciOdeme ("Ayse Fatma",300.0,"PayPal",true);
     
        System.out.println("---Kart ile Odeme Islemi---");
        kart.bilgiYazdir();
        kart.odemeyiGerceklestir();
        kart.taksitBilgisiYazdir(3);

        System.out.println("\n---Cevrimici Odeme Islemi---");
        online.bilgiYazdir();
        online.odemeyiGerceklestir();
        online.guvenlikBilgisiGoster();

        System.out.println("\n---Upcasting Uygulaması---");
        OdemeIslemi odemeRaf = online;
        odemeRaf.bilgiYazdir();
        odemeRaf.odemeyiGerceklestir();
        System.out.println("\n---Downcasting Uygulaması---");
        if(odemeRaf instanceof CevrimiciOdeme){
            CevrimiciOdeme cevrimiciOdeme = (CevrimiciOdeme) odemeRaf;
            cevrimiciOdeme.guvenlikBilgisiGoster();
        }
    }
}   

