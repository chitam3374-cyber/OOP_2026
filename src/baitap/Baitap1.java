package baitap;

import java.util.Scanner;

// sữ dụng thư viện theo kiể này để sữ dụng các hàm toán học thuận tiện không cần Math.hàm
public class Baitap1
{
   public static void main(String[] args)
    {
        // nhập 1 số nếu số đó lẻ thì in ra odd nếu chẵn in ra even
        Scanner input=new Scanner(System.in);
        // tạo kiểu dữ liệu nhập vào tạo object
        System.out.print("enter the number:");
        // câu lệnh in ra màn hình
        int a=input.nextInt();
        // khởi tạo biến và đồng thời gán biến
        if(a%2==0)
        // cấu trúc if else
        {
            System.out.print("EVEN");
        }
        else{
            System.out.print("ODD");
        }

        
    }
}