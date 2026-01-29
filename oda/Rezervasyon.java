public class Rezervasyon {
    protected String musteriAdi;
    protected String girisTarihi ;
    protected int geceSayisi ;
    
    public Rezervasyon(String musteriAdi, String girisTarihi, int geceSayisi) {
        this.musteriAdi = musteriAdi;
        this.girisTarihi = girisTarihi;
        this.geceSayisi = geceSayisi;
    }
    public void rezervasyonYap(){
        System.out.println("rezervasyon basariyla olusturuldu");

    }
    public void rezervasyonIptal(){
        System.out.println("rezervasyon basariyla iptal edildi");
    }
    public void bilgiYazdir(){
        System.out.println("musteri:"+ musteriAdi + "\ngiris tarihi:"+ girisTarihi );
    }   
}
