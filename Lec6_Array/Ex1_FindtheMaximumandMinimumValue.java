package Lec6_Array;

import java.util.Scanner;

public class Ex1_FindtheMaximumandMinimumValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of values: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int i2 = i + 1;
            System.out.print(i2 + " value: ");
            a[i] = scanner.nextInt();
        }
        int max = -1000000;
        int min = 10000000;
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            } else if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("The maximum value is: " + max + ", The minimum value is: " + min);
    }
}
