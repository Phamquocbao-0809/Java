package Lec6_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex6_UnlimitedDataEntry {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        ArrayList<Integer> a = new ArrayList<>();
        int n = -2;
        int sum = 0;
        while (n != -1) {
            if (n != -1) {
                n = scanner.nextInt();
                a.add(n);
            }
        }
        System.out.print("Numbers entered: ");
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) != -1) {
                System.out.print(a.get(i));
                sum = sum + a.get(i);
                System.out.print(" ");
            }
        }
        System.out.println(", The sum is: " + sum);
    }
}
