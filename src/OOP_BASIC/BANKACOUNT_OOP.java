package OOP_BASIC;

class client{
    // lock biến cho biến chỉ có thể truy cập trong class hoặc thôngq ua method
 private String nameaccount;
 private double balance;
 public static String nganhang="VIETINBANK";
 // tạo constructor hàm khởi tạo  lưu ý hàm này kiểu dữ liệu chính là tên class
    // this dùng dể chỉ biến của object
 public client (String nameaccount,double balance){
 this.nameaccount=nameaccount;
 this.balance=balance;
 }
 // method in ra màn hình
 public void display(){
     if(balance>0) {
         System.out.println(nameaccount + " " + balance);
         System.out.println(nganhang);
     }
 }
 // get set
 public String  getnameaccount(){
     return nameaccount;
 }
 public double  getbalance(){
     return balance;
 }



}




public class BANKACOUNT_OOP {
    public static void main(String[] args) {


    }
}
