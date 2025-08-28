package Lec6_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Ex13_MergeTwoSortedArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu mang 1: ");
        int n1 = scanner.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            int i2 = i + 1;
            System.out.print("- Nhap phan tu thu " + i2 + ": ");
            a1[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(a1));
        System.out.print("Nhap so luong phan tu mang 2: ");
        int n2 = scanner.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            int i2 = i + 1;
            System.out.print("Nhap phan tu thu " + i2 + ": ");
            a2[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(a2));
        int[] a3 = new int[n1 + n2];
        int k = 0;
        for (int i = 0; i < a3.length; i++) {
            if (i < a1.length) {
                a3[i] = a1[i];
            }
            if (i >= a1.length) {
                a3[i] = a2[k];
                k++;
            }
        }
        for (int i = 0; i < a3.length; i++) {
            for (int j = i + 1; j < a3.length; j++) {
                if (a3[i] > a3[j]) {
                    int tam = a3[i];
                    a3[i] = a3[j];
                    a3[j] = tam;
                }
            }
        }
        System.out.println(Arrays.toString(a3));
    }
}
