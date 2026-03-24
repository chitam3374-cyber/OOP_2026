package Review_EXAM;

import java.util.HashSet;

class book{
    private int bookID;
    private String title;
    protected double basePirce;
    private static HashSet<Integer> usedID=new HashSet<>();
    public  book(int bookID, String title, double basePrice){
        if(bookID<=0&&basePrice<=0&&usedID.contains(bookID)){
            throw  new IllegalArgumentException("System is Error");

        }
        this.bookID=bookID;
        this.title=title;
        this.basePirce=basePrice;

    }
    public void setPrice(double x){
        this.basePirce=x;
    }

    public int getBookID() {
        return bookID;
    }
    public String getTitle() {
        return title;
    }
    public double finalprice() {
        return basePirce;
    }


}

class Ebook extends book{
private double downloadfee=5;
public Ebook(int bookID, String title, double basePrice, double downloadfee){
    super(bookID,title,basePrice);
    this.downloadfee=downloadfee;
}
public double calculatePrice(){
    return super.finalprice()+downloadfee;
}

}









public class Book_System {
    public  static void main(String[] args) {
        book B1=new book(1,"The aventure time",5000);
        Ebook E1=new Ebook(1,"The batman",50000,5000);
        B1.setPrice(50000);
        System.out.println(B1.finalprice());
        System.out.println(E1.calculatePrice());

    }
}
