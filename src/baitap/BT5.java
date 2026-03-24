package baitap;
import java.util.Scanner;
class person{
    String name;
    int age;
    String phone;
    public  person(String name,int age,String phone){
        this.name=name;
        this.age=age;
        this.phone=phone;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
public class BT5 {
    person p1=new person("Chung Chi Tam ",20,"0938002314");
    person p2= new person("Pham khanh Hung", 28, "0389023364");
    person p3=new person("Le Hoang Long", 30, "0398308905");
}
