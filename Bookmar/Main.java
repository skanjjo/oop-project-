import java.util.Scanner;
 public class Main {
       public static void main (String[] args ){
        Scanner scanner =new Scanner(System.in );
      
    Book myBook = new Book("java programlama ",150);
     
    boolean running = true ;
      while (running) {
        System.out.println("\n---Menu ---");
        System.out.println("1.kitap bilgisi yazdır");
        System.out.println("2.Saya ac");
        System.out.println("3.yer imi birak ");
        System.out.println("4.yer imine git ");
        System.out.println("5.GC Demonstrasyonu (Nesneyi Sil ) ");
        System.out.println("6.cikis ");
        System.out.print("Seciminiz : ");
        
        int choice =scanner.nextInt(0);
         switch (choice ){ 
            case 1:
            if (myBook != null ) myBook.printInfo();
            else System.out.println(    "Kitap nesnesi mevcut degil.");
            break;
         case 2: 
           if (myBook !=null){
            System.out.print("Gitmek istediğniz sayfa :");
              int p = scanner.nextInt();
              myBook.openTopage(p);
           }
           break;
           case 3:

           if (myBook != null) myBook.PlaceBookmark();

            break;
         case 4:
            if (myBook != null) myBook.goToBookmark();
            break;
         case 5:
            myBook =null;
            System.gc();
            System.out.println("Nesne null yapıldı ve GC cagırılddı .");
            break ;
        case 6:
            running =false ;
            System.out.println("Program sonlandırılıyor...");
            break;
        default :
           System.out.println(  "GECERSİZ SECİM");

         }
      };
    scanner.close();
    
    }

   
}
 