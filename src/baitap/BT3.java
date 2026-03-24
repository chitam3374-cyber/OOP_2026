package baitap;
import java.util.Scanner;
class client{
    String name;
    int age;
    int celender;
    String Phone;
    public client(String name, int age, int celender, String phone) {
        this.name = name;
        this.age = age;
        this.celender = celender;
        this.Phone = phone;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
public class BT3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        client cl1=new client("Chung Chi Tam", 20, 2026, "0938002314");
        cl1.display();
    }

}
