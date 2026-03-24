package baitap;

import java.util.Scanner;

// sữ dụng thư viện theo kiể này để sữ dụng các hàm toán học thuận tiện không cần Math.hàm
public class Baitap18

{   // tạo hàm phân tích thừa số nguyên tố
    public static void phantichthuasonguyento(int m){
        if(m<=1)return ;
        for(int i=2; i<=Math.sqrt(m);i++){
            while(m%i==0){
                System.out.print(i+" ");
                m/=i;
            }
        }
        if(m>1) System.out.print(m);
    }
   public static void main(String[] args)
    { Scanner input= new Scanner(System.in);
        int m=input.nextInt();
        phantichthuasonguyento(m);

    }
}