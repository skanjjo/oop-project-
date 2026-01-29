public class Book { 
    private  String title;
    private int totalPages;
    private int currentPage;
    private Bookmark bookmark;
   
    public Book (){
        this.title="Bilinmeyen Kitap";
        this.totalPages =10;
        this.currentPage=1;
        this.bookmark =new Bookmark();
    }
public Book (String  title, int totalPages){
  this.title= (title == null || title.isEmpty ()) ? "untitled ": title;
  this.totalPages=Math.max (10,totalPages);
  this.currentPage =1;
 this.bookmark =new Bookmark();
}
public void openTopage(int Page){
   if (Page >=1 && Page<= totalPages){
          this.currentPage =Page;
          System.out.println("Uyar : gercersiz sayfa numarası !");
   } 
}
 public void PlaceBookmark (){
    bookmark.setPage(currentPage);
    System.out.println("yer imi eklendi : "+currentPage+" sayfaya bırakladı ");

 }
public void goToBookmark(){
    this.currentPage =bookmark.getpage();
    System.out.println(" yer imine gidildi şu anki sayfa :"+currentPage);
}
public void printInfo(){
    System.out.println("--- kitap Biligileri---");
    System.out.println("Başlık :"+ title+"|Toplam sayfa :"+ totalPages+"şu amki sayfa :"+ currentPage );
     Bookmark.printInfo();
}
@Override
protected void finalize() throws Throwable {
    System.out.println("Book nesnesi("+title+") bellekten siliniyor.");
    super.finalize();
    }


}
    

