package baitap;

import java.util.Scanner;

// sữ dụng thư viện theo kiể này để sữ dụng các hàm toán học thuận tiện không cần Math.hàm
public class Baitap15
{   // tạo method sort mảng tăng dân với hàm sswap tạo thủ công
    public static void sortascending(int[]arr, int n){
        for(int i=0; i<n-1;i++){
            for (int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }


    }
   public static void main(String[] args)
    {
        // nhập 1 số nếu số đó lẻ thì in ra odd nếu chẵn in ra even
        Scanner input=new Scanner(System.in);
        System.out.print("enter the number to identified array and sort them:");
        int n=input.nextInt();
        int [] arr=new int[n];
        // nhập dữ liệu vào mảng và sort
        for(int i=0; i<n; i++){
            arr[i]=input.nextInt();
        }
        sortascending(arr,n);
        for(int i=0; i<n;i++){
            System.out.print(arr[i]+" ");
        }

        
    }


}