package baitap;

import java.util.Scanner;

// sữ dụng thư viện theo kiể này để sữ dụng các hàm toán học thuận tiện không cần Math.hàm
public class Baitap4
{
   public static void main(String[] args)
    {
        // nhập 1 số nếu số đó lẻ thì in ra odd nếu chẵn in ra even
        Scanner input=new Scanner(System.in);
        System.out.print("enter the number to sum all digit from 1 to n:");
        int n=input.nextInt();
        int sum=0;
        for (int i=1; i<=n; i++){
            sum+=i;
        }
        System.out.print("the result is:"+sum);
        
    }
}