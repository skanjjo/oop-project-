public enum OdaTipi {
    STANDART(1000.0),
    DELUXE(1500.0),
    SUIT(2500.0);
 
    private double gecelikUcret;
    OdaTipi(double gecelikUcret){
        this.gecelikUcret=gecelikUcret;
    }
    public double getGecelikUcret(){
        return gecelikUcret;
    }
}