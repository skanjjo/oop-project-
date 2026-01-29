public class OtelRezervasyonu extends Rezervasyon{
    private OdaTipi odaTipi;
    private int kisiSayisi;
    private boolean spaPaketiDahilMi;
     
     public OtelRezervasyonu(String musteriAdi, String girisTarihi, int geceSayisi,
                             OdaTipi odaTipi, int kisiSayisi, boolean spaaPaketiDahilMi){
        super(musteriAdi, girisTarihi, geceSayisi);
        this.odaTipi=odaTipi;
        this.kisiSayisi=kisiSayisi;
        this.spaPaketiDahilMi=spaPaketiDahilMi;
     }
     @Override
     public void bilgiYazdir() {
        super.bilgiYazdir(); 
        System.out.println("Oda Tipi: " + odaTipi + ", Kişi: " + kisiSayisi); 
        System.out.println("Gecelik Ücret: " + odaTipi.getGecelikUcret() + " TL"); 
        System.out.println("Spa Paketi: " + (spaPaketiDahilMi ? "Dahil" : "Dahil Değil")); 
    }
    public double toplamUcretHesapla(){
        double toplamUcret=odaTipi.getGecelikUcret()*kisiSayisi*geceSayisi;
        if(spaPaketiDahilMi){
            toplamUcret+=500.0;        }
        return toplamUcret;
    }
}