package Lec6_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex14_RemovingElementsfromanArrayListduringIteration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        System.out.print("Nhap so luong phan tu: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int i2 = i + 1;
            System.out.print("Nhap phan tu thu " + i2 + ": ");
            int i3 = scanner.nextInt();
            a.add(i3);
        }
        System.out.println(Arrays.toString(a.toArray()));
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > 50) {
                a.remove(i);
            }
        }
        System.out.println(Arrays.toString(a.toArray()));
    }
}
