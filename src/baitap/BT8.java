package baitap;
import java.util.Scanner;
class US{
    private String name;
    private int passowrd;
    private int birddate;
    private String phone;
    public US(String name,int passowrd,int birddate,String phone){
        this.name=name;
        this.passowrd=passowrd;
        this.birddate=birddate;
        this.phone=phone;

    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Passowrd: "+passowrd);
    }
    public  String getName(){
        return name;
    }
    public int getPassowrd(){
        return passowrd;
    }
    public int getBirddate(){
        return birddate;
    }
    public String getPhone(){
        return phone;
    }
    public void  setName(String name){
        this.name = name;
    }
    public void setPassowrd(int passowrd){
        this.passowrd = passowrd;
    }
}

public class BT8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        US us1=new US("Chung ChI Tam", 0346, 07062007,"0938002314");
        us1.display();
    }
}
