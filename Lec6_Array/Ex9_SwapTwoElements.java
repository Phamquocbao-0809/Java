

package Lec6_Array;

import java.util.Scanner;

public class Ex9_SwapTwoElements {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            int i2=i+1;
            System.out.print("Nhap phan tu thu " + i2 + ": ");
            a[i] = scanner.nextInt();
        }
        System.out.print("[");
        for(int i=0;i<a.length;i++){
            if(i!=a.length-1)
            System.out.print(a[i] + ", ");
            else
                System.out.print(a[i]);
        }
        System.out.print("]");
        System.out.println();
        System.out.print("Swap: ");
        int i1 = scanner.nextInt();
        int i2 = scanner.nextInt();
        int i3 = 0;
        int i4 = 0;
        for(int i = 0;i<a.length;i++){
            if(i==i1){
                i3 = a[i];
            } else if(i==i2){
               i4 = a[i];
            }
        }
        a[i1] = i4;
        a[i2] = i3;
        System.out.print("[");
        for(int i=0;i<a.length;i++){
            if(i!=a.length-1)
            System.out.print(a[i] + ", ");
            else
                System.out.print(a[i]);
        }
        System.out.print("]");
    }
}
