package baitap;

import java.util.Scanner;

// sữ dụng thư viện theo kiể này để sữ dụng các hàm toán học thuận tiện không cần Math.hàm
public class Baitap16
{ // tạo ham,f xóa phần tử
    public static void removeeleinarrray(int [] arr, int n, int value){
        for(int i=0; i<n; i++){
            if (arr[i]==value)
                continue;
            System.out.print(arr[i]+" ");
        }
    }
   public static void main(String[] args)
    {
        // nhập 1 số nếu số đó lẻ thì in ra odd nếu chẵn in ra even
        Scanner input=new Scanner(System.in);
        System.out.print("enter the number ele in array:");
        int n=input.nextInt();
        int []array= new int[n];
        for(int i=0; i<n;i++){
            array[i]=input.nextInt();
        }
        for(int i=0; i<n;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();// tương tự như cout<<endl;
        System.out.println("enter value that you want to eliminate:");
        int value=input.nextInt();
        removeeleinarrray(array,n,value);
    }

}