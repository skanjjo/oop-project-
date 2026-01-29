public class CevrimiciOdeme extends OdemeIslemi{
   private  String platformAdi;
   private boolean guvrnliMi;

    public CevrimiciOdeme(String musteriAdi, double tutar, String platformAdi, boolean guvrnliMi) {
          super(musteriAdi, tutar);
          this.platformAdi = platformAdi;
          this.guvrnliMi = guvrnliMi;
     }
    @Override
    public void odemeyiGerceklestir(){
         double komisyon = tutar * 0.015;
         double toplam = tutar + komisyon;
    String guvenlikMesaji = guvenliMi ? "(Guvenli odeme )":"";
    System.out.println("cevrim ici odeme alındı -> platform:"+ platformAdi+"muster"+ musteriAdi+ ",Tutar:"+tutar+",Komisyon :"+komisyon +"komisyon "+ komisyon + "Toplam:"+toplam+guvenlikMesaji); 

}  
public void guvenlikBilgisiGoster(){
    if(guvrnliMi){
        System.out.println("EK guvenlik aktif");
    } else {
        System.out.println("Standart guvenlik kullaniliyor");
    }
}
}
