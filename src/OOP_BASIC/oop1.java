package OOP_BASIC;
import java.util.Scanner;
class student {
    String name;
    String phonenumber;
    int age;
    void introduce() {
        System.out.println("Tên: " + name + ", Tuổi: " + age);
    }
}
class dog{
    String name;
    int age;
    // method
    void classify(){ System.out.println("Name:"+name+",Age:"+age);}
}
class employees{
    String name;
    int age;
    String phone;
    String celendar;
    String address;
    // method
    void signinschedule(){
        System.out.println("Name:"+name+",Age:"+age+"time:"+celendar);
    }
}

public class oop1 {

    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        // gọi object 1
        student s1=new student();
        s1.name="Chung Chi Tam";
        s1.age=10;
        s1.phonenumber="0938002314";
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.phonenumber);
        s1.introduce();
        // gọi một object thuộc class khác
        dog pet1=new dog();
        pet1.name="lucy";
        pet1.age=10;
        System.out.println(pet1.name);
        System.out.println(pet1.age);
        pet1.classify();
        // lại tiếp tục gọi một object khác
        employees employ1= new  employees();
        employ1.name="Nguyen Van Hung";
        employ1.age=18;
        employ1.address="34 duong hong ban, tan thanh, tphcm";
        employ1.celendar="ca 2-18h-22h";
        employ1.phone="0932114750";
        System.out.println(employ1.name);
        System.out.println(employ1.age);
        System.out.println(employ1.address);
        System.out.println(employ1.celendar);
        System.out.println(employ1.phone);
        employ1.signinschedule();
    }
}
