package OOP_BASIC;
import java.util.Scanner;
class STUDENTM{
    // attribute  dữ liệu biến được encapsulation được đóng gói không thể chỉnh sửa bên ngoài class
    private String name;
    private int    age;
    private String email;
    private String phone;
    private String address;
    private String city;
    // tạo 1 biến static có thể dùng chung trong class không riêng 1 object nào cả
    public static String school="INTERNATIONAL UNIVERSITY";
    public STUDENTM(String n, int a, String e,String p, String add, String CITY){
        this.name=n;
        this.age=a;
        this.email=e;
        this.phone=p;
        this.address=add;
        this.city=CITY;
    }
    // tạo method
    public void display(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Email: "+this.email);
        System.out.println("Phone: "+this.phone);
        System.out.println("Address: "+this.address);
        System.out.println("City: "+this.city);
        // in ra như biến bình thương nhưng nó không phải của object nào nên nó không cần this vẫn được
        System.out.println("UNIVERSITY:"+school);
    }
    // KIẾN THỨC VỀ GET VÀ SET LẤY VÀ ĐẶT LẠI DỮ LIỆU
    // TRUY CẬP VÀ TRẢ VỀ DƯ LIỆU THEO KIỂU DỮ LIỆU CỦA BIẾN CẢU OBJECT
    public String getName() {
        return name;
    }
    // THAY ĐỔI DỮ LIỆU
    public void setName(String name) {
        this.name = name;
    }
}
public class STUDENTMANAGE_OOP {
    public static void main(String[] args) {
        STUDENTM S1= new STUDENTM("CHUNG CHI TAM",20,"CC7820197@GMAIL.COM","0938002314","34 ĐƯỜNG S3","TPHCM");
      System.out.println( S1.getName());
      // LẤY DỮ LIỆU RA ĐỂ KIỂM CHỨNG
      S1.display();
      // in thông tin bằng method
      S1.setName("CHUNG QUẾ ANH");
      // thay đổi dữ liệu
      S1.display();
      // in lại thông tin 1 lần nữa
    }
}
