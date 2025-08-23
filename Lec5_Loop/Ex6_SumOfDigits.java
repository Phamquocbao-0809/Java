package Lec5_Loop;

import java.util.Scanner;

public class Ex6_SumOfDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        while (n < 0) {
            System.out.print("Enter n: ");
            n = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            sum = sum + (n % 10);
            n = n / 10;
        }
        System.out.println("The sum of the digits is: " + sum);
    }
}
