package baitap;

import java.util.Scanner;

// sữ dụng thư viện theo kiể này để sữ dụng các hàm toán học thuận tiện không cần Math.hàm
public class Baitap9
{
   public static void main(String[] args)
    {
        // nhập 1 số nếu số đó lẻ thì in ra odd nếu chẵn in ra even
        Scanner input=new Scanner(System.in);
        System.out.print("enter the number to find giai thua n:");
        int n=input.nextInt();
        System.out.print("giai thuachu so cua n la:"+giaithua(n));
        
    }
    static int giaithua(int n){
       int res=1;
       for(int i=1; i<=n;i++){
           res*=i;
       }
       return res;

    }
}