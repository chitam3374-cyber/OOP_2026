package baitap;

import java.util.Scanner;

// sữ dụng thư viện theo kiể này để sữ dụng các hàm toán học thuận tiện không cần Math.hàm
public class Baitap3
{
   public static void main(String[] args)
    {
        // nhập 1 số nếu số đó lẻ thì in ra odd nếu chẵn in ra even
        Scanner input=new Scanner(System.in);
        // khởi tạo object nhập liệu với System.in
        System.out.print("input a char: ");
        // câu lệnh in ra

        char kt=input.nextLine().charAt(0);

        // khai báo kiểu char thì phải có .charAt(0)
        // tuy nhiên nếu string thì không cần làm như vậy
        if((kt>='A')&&(kt<='Z'))
        // nếu kí tự đó là kí tự thuộc tập kí tự hoa như bảng ASCIL
            {
            System.out.print("Co in hoa");
        }
        else{
            System.out.print("khong in hoa");
        }

        
    }
}