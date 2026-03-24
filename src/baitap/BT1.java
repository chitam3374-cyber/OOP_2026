package baitap;
import java.util.Scanner;
class Student{
    String name;
    int age;
    public void display(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
    }
}

public class BT1 {
    public static void main(String[] args){
        Student s1= new Student();
        Scanner input = new Scanner(System.in);
        System.out.print("enter the name of the student:");
        s1.name=input.nextLine();
        input.nextLine();
        System.out.print("enter the age of the student:");
        s1.age=input.nextInt();
        System.out.println("Name:"+s1.name);
        System.out.println("Age:"+s1.age);
        s1.display();
    }


}
