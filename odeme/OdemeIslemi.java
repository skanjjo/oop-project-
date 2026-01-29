public abstract class OdemeIslemi {
   protected String musteriAdi;
    protected double tutar;
      
    public OdemeIslemi(String musteriAdi, double tutar) {
        this.musteriAdi = musteriAdi;
        this.tutar = tutar;
    }
   public void bilgiYazdir() {
    System.out.println("musteri adı:"+musteriAdi+"tutar:"+tutar);
   }
public abstract void odemeyiGerceklestir();
}