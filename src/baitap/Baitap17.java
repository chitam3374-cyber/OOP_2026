package baitap;

import java.util.Scanner;

// sữ dụng thư viện theo kiể này để sữ dụng các hàm toán học thuận tiện không cần Math.hàm
public class Baitap17
{   public static boolean identifysochinhphuong(int value){
    double m=Math.sqrt(value);
    int n=(int)m;
    if(value==n*n){
        return true;
    }
    return false;

}
   public static void main(String[] args) {
 Scanner cin= new Scanner(System.in);
       System.out.println("enter the number to identify chinh phuong num:");
 int value=cin.nextInt();
 if(identifysochinhphuong(value)){
     System.out.println("so chinh phuong");
 }
 else{
     System.out.println("khong phai so chinh phuong");
 }

   }
}