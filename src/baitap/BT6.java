package baitap;
import java.util.Scanner;
class bk{
    private String name;
    private int age;
    public  bk(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

}
public class BT6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        bk b1=new bk("Chung Chi Tam", 20);
        b1.display();
    }
}
