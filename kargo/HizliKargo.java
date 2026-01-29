public class HizliKargo  implements Kargo {
    private double agirlik ;
    private int mesafe  ;
    public HizliKargo (double agirlik , int mesafe){
        this.agirlik = agirlik ;
        this.mesafe = mesafe ;
    }
    @Override
    public void kargoBilgisiYazdir() {
        System.out.println("Hizli Kargo secildi. Agirlik : "+agirlik+" kg , Mesafe : "+mesafe+" km");
    }
    @Override
    public double ucretHesapla(){
        double temelUcret = (agirlik * 15) + (mesafe * 0.5);
        return temelUcret + (temelUcret * SabitDegerler.KDV_ORANI);
    }
    public void hizliTeslşmatBilgisi(){
        System.out.println("Bilgi Hızlı teslimat seçeneği seçildi");
    }
}