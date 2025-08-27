package Lec6_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Ex11_FindtheSecondLargestElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            int i2 = i + 1;
            System.out.print("Nhap phan tu thu " + i2 + ": ");
            a[i] = scanner.nextInt();
        }
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            if (i < a.length - 1) {
                System.out.print(a[i] + ", ");
            } else {
                System.out.print(a[i]);
            }
        }
        System.out.print("]");
        System.out.println();
        int max = -1000000000;
        int max2 = max;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max2 && a[i] < max) {
                max2 = a[i];
            }
        }
        System.out.println("So lon thu hai la: " + max2);
    }
}
