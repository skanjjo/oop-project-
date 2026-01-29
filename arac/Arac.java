public class Arac {
    protected String marka ;
    protected String model ;
    protected int yil ;


    public Arac( String marka, String model, int yil ) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
    }
    public void calistir(){
        System.out.println(marka+""+model+"calıtırılıyor");
    }
    public void durdur(){
        System.out.println(marka+""+model+"durdurldu");
    }

    public void bilgiYazdir(){
        System.out.println("marka:"+marka +"model:"+model+"yil:"+yil);
    }
}
