package Lec5_Loop;

import java.util.Scanner;

public class Ex1_CalculatetheSumofNumbersfrom1toN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Tong: " + sum);
    }
}
