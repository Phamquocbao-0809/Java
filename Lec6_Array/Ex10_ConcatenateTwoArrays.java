
package Lec6_Array;

import java.util.Scanner;

public class Ex10_ConcatenateTwoArrays {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu mang 1: ");
        int n1 = scanner.nextInt();
        int[] a1 = new int[n1];
        for(int i=0;i<a1.length;i++){
            int i2 = i+1;
            System.out.print("Nhap phan tu thu " + i2 + ": ");
            a1[i] = scanner.nextInt();
        }
        System.out.print("Mang 1: [");
        for(int i=0;i<a1.length;i++){
            if(i!=a1.length-1)
            System.out.print(a1[i] + ", ");
            else
                System.out.print(a1[i]);
        }
        System.out.print("]");
        System.out.println();
        System.out.print("Nhap so luong phan tu mang 2: ");
        int n2 = scanner.nextInt();
        int[] a2 = new int[n2];
        for(int i=0;i<a2.length;i++){
            int i2 = i+1;
            System.out.print("Nhap phan tu thu " + i2 + ": ");
            a2[i] = scanner.nextInt();
        }
        System.out.print("Mang 2: [");
        for(int i=0;i<a2.length;i++){
            if(i!=a2.length-1)
            System.out.print(a2[i] + ", ");
            else
                System.out.print(a2[i]);
        }
        System.out.print("]");
        int n3 = n1+n2;
        int[] a3 = new int[n3];
        int n4=0;
        for(int i=0;i<a3.length;i++){
            if(i<a1.length){
                a3[i] = a1[i];
            } else if(i>=a1.length){
                a3[i] = a2[n4];
                n4++;
            }
        }
        System.out.println();
        System.out.print("Mang 3: [");
        for(int i=0;i<a3.length;i++){
            if(i!=a3.length-1)
            System.out.print(a3[i] + ", ");
            else
                System.out.print(a3[i]);
        }
        System.out.print("]");
    }
}
