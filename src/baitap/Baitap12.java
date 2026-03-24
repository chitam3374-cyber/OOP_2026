package baitap;

import java.util.Scanner;


// sữ dụng thư viện theo kiể này để sữ dụng các hàm toán học thuận tiện không cần Math.hàm
public class Baitap12
{
   public static void main(String[] args)
    {

        Scanner input=new Scanner(System.in);
        System.out.print("enter the number to find max element in array:");
        int n=input.nextInt();
        int[] arr=new int[n];
        int max=arr[0];
        for(int i=0; i<n; i++){
            arr[i]=input.nextInt();
        }
        for (int i=0; i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);




        
    }

}