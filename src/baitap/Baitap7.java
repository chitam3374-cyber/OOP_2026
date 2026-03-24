package baitap;

import java.util.Scanner;

// sữ dụng thư viện theo kiể này để sữ dụng các hàm toán học thuận tiện không cần Math.hàm
public class Baitap7
{
   public static void main(String[] args)
    {
        // nhập 1 số nếu số đó lẻ thì in ra odd nếu chẵn in ra even
        Scanner input=new Scanner(System.in);
        System.out.print("enter the number to find sumdigit n:");
        int n=input.nextInt();
        System.out.print("tong cac chu so cua n la:"+sumdigit(n));
        
    }
    static int sumdigit(int n){
       int sum=0;
       while(n!=0){
           sum+=n%10;
           n/=10;

       }
       return sum;

    }
}