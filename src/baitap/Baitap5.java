package baitap;

import java.util.Scanner;

// sữ dụng thư viện theo kiể này để sữ dụng các hàm toán học thuận tiện không cần Math.hàm
public class Baitap5
{
   public static void main(String[] args)
    {
        // nhập 1 số nếu số đó lẻ thì in ra odd nếu chẵn in ra even
        Scanner input=new Scanner(System.in);
        System.out.print("enter the number to tim bang cuu chuong tu 1 toi n:");
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=10; j++){
                int m=i*j;
                System.out.print(m+" ");
            }
            System.out.print("\n");
        }
        
    }
}