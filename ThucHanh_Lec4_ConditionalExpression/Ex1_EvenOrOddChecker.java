package Lec4_ConditionalExpression;

import java.util.Scanner;

public class Ex1_EvenOrOddChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " la so chan");
        } else {
            System.out.println(number + " la so le");
        }
    }
}
