package Lec6_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex7_RemoveDuplicateElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong gia tri: ");
        int n = scanner.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int i2 = i + 1;
            System.out.print("Nhap gia tri thu " + i2 + ": ");
            int b = scanner.nextInt();
            a.add(b);
        }
        System.out.println(Arrays.toString(a.toArray()));
        for (int i = 0; i < a.size(); i++) {
            int a2 = a.get(i);
            for (int k = i + 1; k < a.size(); k++) {
                int a3 = a.get(k);
                if (a2 == a3) {
                    a.remove(k);
                    
                }
            }
        }
        System.out.print(Arrays.toString(a.toArray()));
    }
}
