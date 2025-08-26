package Lec6_Array;

import java.util.Scanner;

public class Ex5_FilterEvenNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong gia tri: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int i2 = i + 1;
            System.out.print("Nhap gia tri thu " + i2 + ": ");
            a[i] = scanner.nextInt();
        }
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            if (i != n - 1) {
                System.out.print(a[i] + ", ");
            } else {
                System.out.print(a[i]);
            }
        }
        System.out.println("]");
        int[] b = new int[n];
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                b[s] = a[i];
                s++;
                n--;
            }
        }
        System.out.print("So chan [");
        for (int i = 0; i < n; i++) {
            if (i != n - 1) {
                System.out.print(b[i] + ", ");
            } else {
                System.out.print(b[i]);
            }
        }
        System.out.println("]");
    }
}
