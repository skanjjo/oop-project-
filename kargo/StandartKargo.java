public class StandartKargo implements Kargo {
    private double agirlik ;
     public StandartKargo (double agirlik){

     }
     @Override
     public void kargoBilgisiYazdir() {
         System.out.println("Standart Kargo secildi. Agirlik : "+agirlik+" kg");

     }
     @Override 
     public double ucretHesapla(){
        double temelUcret = agirlik * 10;
        return temelUcret + (temelUcret * SabitDegerler.KDV_ORANI);
     }
}
