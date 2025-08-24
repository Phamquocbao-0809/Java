package Lec5_Loop;

import java.util.Scanner;

public class Ex4_DrawaRightAngledTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        int s = 1;
        for (int i = 1; i <= n; i++) {
            for (int i2 = 1; i2 <= s; i2++) {
                System.out.print(i2);
            }
            s++;
            System.out.println();
        }
    }
}
