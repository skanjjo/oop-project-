public class Bookmark {
     private int page ;

     public Bookmark() {
         this.page = 1;
     }
public Bookmark (int page ){
    this.page = Math.max(1,page );
}
public int getpage(){
    return page;
}
public void setPage(int page ){
    this.page = Math.max(1,page);
}
public void setPage(){
    System.out.println("yer imi şu anki sayfa :"+page);
}
@Override
protected void finalize() throws Throwable {
    System.out.println("bookmar nesnesi bellekten siliniyor.");
    super.finalize();
}
}   