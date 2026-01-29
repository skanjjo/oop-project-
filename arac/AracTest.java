public class AracTest {
    public static void main (String[] args ){
        Arac genelArac = new Arac ("Toyota","Corolla",2020);
        KaraAraci kamyon = new KaraAraci("Meecedes","Axor",2020,10,YakitTuru.DIZEL);
        Otomobil binekOto = new Otomobil("Tesla", "Model S", 2023, 4, YakitTuru.ELEKTRIK, 4);
        
        System.out.println("--- Arac Nesnesi-- ");
        genelArac.calistir();
        genelArac.bilgiYazdir();
        genelArac.durdur(); 
        System.out.println("\n--- Kara Araci Nesnesi-- ");
        kamyon.calistir();  
        kamyon.bilgiYazdir();
        kamyon.durdur();
        System.out.println("\n--- Otomobil Nesnesi-- ");
        binekOto.calistir();    
        binekOto.bilgiYazdir();
        binekOto.klimaAc();
        binekOto.durdur();
    }
    
}
