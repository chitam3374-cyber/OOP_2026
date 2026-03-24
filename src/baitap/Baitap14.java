package baitap;

import java.util.Scanner;

// sữ dụng thư viện theo kiể này để sữ dụng các hàm toán học thuận tiện không cần Math.hàm
public class Baitap14
{


    public static  boolean symetricarr( int arr[],int n) {
        for (int i=0; i<n; i++){
            if (arr[i]!=arr[n-1-i]){
                return false;
            }
        }
        return true;
    }
   public static void main(String[] args)
    {
        // nhập 1 số nếu số đó lẻ thì in ra odd nếu chẵn in ra even
        Scanner input=new Scanner(System.in);
        System.out.print("enter the number to find sumdigit n:");
        int n=input.nextInt();
        int [] array=new int[n];
        for (int i=0; i<n; i++){
             array[i]=input.nextInt();
        }
        if (symetricarr(array,n)){
            System.out.println("It is a symetric array");
        }
        else{
            System.out.println("It is not a symetric arr");
        }

        
    }

}