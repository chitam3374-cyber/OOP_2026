package baitap;
import java.util.Scanner;
class custom{
    String name;
    int age;
    int phone;
    int date;
    int month;
    int year;
    public custom(String name, int age, int phone, int date, int month, int year) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.date = date;
        this.month = month;
        this.year = year;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Phone: "+phone);
        System.out.println("Date: "+date);
        System.out.println("Month: "+month);
        System.out.println("Year: "+year);
    }
}
public class BT4 {

}
