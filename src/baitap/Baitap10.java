package baitap;

import java.util.Scanner;

// sữ dụng thư viện theo kiể này để sữ dụng các hàm toán học thuận tiện không cần Math.hàm
public class Baitap10


{
    // ứng dụng lại sàng số nguyên tố



   public static void main(String[] args)
    {
        // nhập 1 số để xác định số nguyên tos từ 1 đến n
        Scanner input=new Scanner(System.in);
        System.out.print("enter the number to find sumdigit n:");
        int n=input.nextInt();
        for(int i=2; i<=n; i++){
            if(isprime(i)){
                System.out.print(i);
            }
        }
    }
    // vì void sữ dụng static nên boolean cũng sữ dụng static
    static boolean isprime(int n) {
     if(n<=1) return false;
     for(int i=2; i<=Math.sqrt(n); i++){
         if(n%i==0){
             return false;
         }
     }
     return true;


    }

}