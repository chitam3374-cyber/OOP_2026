package baitap;

import java.util.Scanner;
public class Main {
     public static void main(String[] args){
        // lệnh đặt tên kiểu cho lệnh nhập liệu
        // Scanner_=new Scanner(System.in);
        Scanner cin=new Scanner(System.in);
        // hiện dòng thông tin cá nhân
        System.out.println("My information:");
        // khai báo và kết hợp gán chuỗi tên
        // khai báo tuổi và gán số cho nó vì java bắt buộc khai báo kết hợp với gán
        System.out.println("Hay nhap tuoi:");
        int age=cin.nextInt();
        // print tuối được khai báo
        System.out.println(age);
        // Giữa int và chuỗi kí tự cần có loại over bufflow như cin.ignore
        // sữ dụng tênlệnh.nextLine(); đây cũng là lệnh nhập cả dòng=getline(cin.biến)
        // sữ dụng tênlệnh.next(); cho nhập chuỗi ko có khoảng trắng
        // cấu trúc chung tênlệnh.next_kiểu dữ liệu(); cho các loại kiểu int, float, doubble, long long
        cin.nextLine();
        // khai báo đồng thời gán kiểu nhập cho nó
        System.out.println("hay nhap ho ten:");
        String hoten=cin.nextLine();
        System.out.println(hoten+age);
        // toán tử cơ bản
        System.out.println(2*5);
        System.out.println(2+5);
    }
}