public class KaraAraci extends Arac {
    private int tekerleksayisi;
    private YakitTuru yakitTuru;

    public KaraAraci(String marka ,String model,int yil,int tekerleksayisi,YakitTuru yakitTuru) {
        super(marka, model, yil);
        this.tekerleksayisi = tekerleksayisi;
        this.yakitTuru = yakitTuru;
    }
    @Override
    public void bilgiYazdir() {
        super.bilgiYazdir();
        System.out.println("Tekerlek Sayısı: " + tekerleksayisi + ", Yakıt Türü: " + yakitTuru);
    }
     
}
