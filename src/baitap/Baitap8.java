package baitap;

import java.util.Scanner;

// sữ dụng thư viện theo kiể này để sữ dụng các hàm toán học thuận tiện không cần Math.hàm
public class Baitap8
{
   public static void main(String[] args)
    {
        // nhập 1 số nếu số đó lẻ thì in ra odd nếu chẵn in ra even
        Scanner input=new Scanner(System.in);
        System.out.print("enter the number to find reverse digit of n:");
        int n=input.nextInt();
        System.out.print("dao cac chu so cua n la:"+reverse(n));
        
    }
    static int reverse(int n){
       int sum=0;
       while(n!=0){
           sum=sum*10+n%10;
           n/=10;

       }
       return sum;

    }
}