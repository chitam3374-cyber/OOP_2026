package baitap;

import java.util.Scanner;

// sữ dụng thư viện theo kiể này để sữ dụng các hàm toán học thuận tiện không cần Math.hàm
public class Baitap11
{
   public static void main(String[] args)
    {
        //In ra các phần tử chẵn.
        // nhập xuất mảng
        Scanner input=new Scanner(System.in);
        System.out.print("enter the number to find sumdigit n:");
        int n=input.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            if(i%2==0)
                System.out.print(i);
        }
    }

}