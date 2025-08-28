
package Lec6_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Ex8_SortandSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5];
        System.out.print("Add 5 Integers: ");
        for (int i = 0; i < 5; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.print("Before:");
        for (int i = 0; i < 5; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();
        Arrays.sort(a);
        System.out.print("After:");
        for (int i = 0; i < 5; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();
        System.out.print("Number to find: ");
        int x = scanner.nextInt();
        int l = 0;
        for (int i = 0; i < 5; i++) {
            if (a[i] == x) {
                l = i;
            }
        }
        System.out.println("-> The number " + x + " was found at index " + l);
    }
}
