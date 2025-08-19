package Lec4_ConditionalExpression;

import java.util.Scanner;

public class Ex8_SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so thu 1: ");
        int n1 = scanner.nextInt();
        System.out.print("Nhap so thu 2: ");
        int n2 = scanner.nextInt();
        System.out.print("Nhap phep tinh: ");
        scanner.nextLine();
        String s = scanner.nextLine();
        switch (s) {
            case "+":
                int n3 = n1 + n2;
                System.out.println(n1 + " + " + n2 + " = " + n3);
                break;
            case "-":
                int n4 = n1 - n2;
                System.out.println(n1 + " - " + n2 + " = " + n4);
                break;
            case "*":
                int n5 = n1 * n2;
                System.out.println(n1 + " * " + n2 + " = " + n5);
                break;
            case "/":
                if (n2 != 0) {
                    int n6 = n1 / n2;
                    System.out.println(n1 + " / " + n2 + " = " + n6);
                } else {
                    while (n2 == 0) {
                        System.out.println("Khong the chia cho mau so bang 0");
                        System.out.print("Nhap lai so thu 2: ");
                        n2 = scanner.nextInt();
                    }
                    int n7 = n1 / n2;
                    System.out.println(n1 + " / " + n2 + " = " + n7);
                }
                break;
        }
    }
}
