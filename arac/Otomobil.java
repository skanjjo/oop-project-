public class Otomobil extends KaraAraci {
    private int kapiSayisi;

    public Otomobil(String marka, String model, int yil, int tekerleksayisi, YakitTuru yakitTuru, int kapiSayisi) {
        super(marka, model, yil, tekerleksayisi, yakitTuru);
        this.kapiSayisi = kapiSayisi;
    }
    public void klimaAc(){
        System.out.println(marka +"aracında klima acıldı");
    }
@Override 
public void bilgiYazdir() {
        super.bilgiYazdir();
        System.out.println("Kapı Sayısı: " + kapiSayisi);
    }    
}
