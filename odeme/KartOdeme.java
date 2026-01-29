public class KartOdeme extends OdemeIslemi{
    private String kartSon4Hane;
    public KartOdeme(String musteriAdi, double tutar, String kartSon4Hane) {
        super(musteriAdi, tutar);
        this.kartSon4Hane = kartSon4Hane;
    }
    @Override
    public void odemeyiGerceklestir(){
        double komisyon = tutar * 0.02;
        double toplam = tutar + komisyon;
        System.out.println("Kart ile ödeme gerçekleştirildi. Kart Son 4 Hane: "
                + kartSon4Hane + " Toplam Tutar: " + toplam);
    }
    public void  taksitBilgisiYazdir(int taksitSayisi){
        System.out.println("islem " + taksitSayisi + "taksit olarak kaydedildi");


    }
}