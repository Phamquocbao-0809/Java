package Lec4_ConditionalExpression;

import java.util.Scanner;

public class Ex4_SimpleCalculator {

    public static void phepTinh(int n1, int n2, String pt) {
        Scanner scanner = new Scanner(System.in);
        switch (pt) {
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
                if (n2 == 0) {
                    while (n2 == 0) {
                        System.out.println("Khong the chia cho mau so bang 0");
                        System.out.print("Nhap lai mau so: ");
                        n2 = scanner.nextInt();
                    }
                    int n7 = n1 / n2;
                    System.out.println(n1 + " / " + n2 + " = " + n7);
                    break;
                } else {
                    int n6 = n1 / n2;
                    System.out.println(n1 + " / " + n2 + " = " + n6);
                    break;
                }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        int n1 = scanner.nextInt();
        System.out.print("Nhap so thu hai: ");
        int n2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap phep tinh: ");
        String pt = scanner.nextLine();
        phepTinh(n1, n2, pt);
    }
}
