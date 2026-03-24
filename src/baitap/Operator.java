package baitap;

import java.util.Scanner;

// sữ dụng thư viện theo kiể này để sữ dụng các hàm toán học thuận tiện không cần Math.hàm
public class Operator
{
   public static void main(String[] args)
    {
        // khai báo tên cảu lệnh nhập dòng
        Scanner cin=new Scanner(System.in);
        System.out.println("enter a:");
        int a=cin.nextInt();
        System.out.println("enter b:");
        int b=cin.nextInt();
        System.out.println("phep cong:");
        System.out.println(a+b);
        System.out.println("phep tru:");
        System.out.println(a-b);
        System.out.println("phep nhan:");
        System.out.println(a*b);
        System.out.println("phep chia");
        System.out.println(a/b);
        System.out.println("chia lay du");
        System.out.println(a%b);

    }
}