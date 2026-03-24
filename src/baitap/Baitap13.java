package baitap;

import java.util.Scanner;

// sữ dụng thư viện theo kiể này để sữ dụng các hàm toán học thuận tiện không cần Math.hàm
public class Baitap13
{

    public static boolean isprime(int n) {
        if(n<=1) return false;
        for(int i=2; i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
   public static void main(String[] args)
    {
        // nhập 1 số nếu số đó lẻ thì in ra odd nếu chẵn in ra even
        Scanner input=new Scanner(System.in);
        // tạo object nhập liệuv ới tên là input
        System.out.print("enter the number :");
        int n=input.nextInt();
        // khai báo biến số lượng phân tử cho mảng nguyên arr
        int [] arr=new int[n];
        // khai báo mảng arr
        for(int i=0; i<n; i++){
            System.out.print("input element arr["+i+"]:");
            arr[i]=input.nextInt();
        }
        int count=0;
        for(int i=0; i<n; i++){
            if(isprime(arr[i])) {
                count++;
            }
        }
        System.out.println("the number of prime number in array:"+count);

        
    }

}