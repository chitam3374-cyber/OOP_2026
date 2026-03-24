package OOP_BASIC;
import java.util.Scanner;
class nemployees{
    String name;
    int age;
    String phone;
    String celendar;
    String address;
    // tạo constructor kiểu một hàm để gọi nhanh hơn bình thường
    nemployees(String a,int b,String c,String d,String e){
        name=a;
        age=b;
        phone=c;
        celendar=d;
        address=e;
    }
    // method
    void signinschedule(){
        System.out.println("Name:"+name+",Age:"+age+"time:"+celendar);
    }
}

public class constructor_oop {

    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        // sữ dụng tới constructor thì sẽ nhanh hơn khai báo bình thường
        nemployees employ1= new nemployees("Chung Chi Tam", 20, "0938002314","ca 2 18h-22h", "34 duong s3, tay thanh, tan phu, tphcm");
        employ1.signinschedule();
    }
}
