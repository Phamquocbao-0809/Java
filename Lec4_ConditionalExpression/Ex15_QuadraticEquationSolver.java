package Lec4_ConditionalExpression;

import java.util.Scanner;

public class Ex15_QuadraticEquationSolver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = scanner.nextInt();
        System.out.print("Nhap b: ");
        int b = scanner.nextInt();
        System.out.print("Nhap c: ");
        int c = scanner.nextInt();
        System.out.println("Phuong trinh co dang " + a + "x^2 + " + b + "x + " + c);
        if (a == 0) {
            System.out.println("Phuong trinh co dang " + b + "x + " + c);
            float c2 = c;
            float b2 = b;
            float n = -c2 / b2;
            System.out.println("-> Phuong trinh co 1 nghiem: " + "x = " + n);
        } else {
            double delta = Math.pow(b, 2) - 4 * a * c;
            System.out.println("Delta = " + delta);
            if (delta < 0) {
                System.out.println("-> Phuong trinh vo nghiem");
            } else if (delta == 0) {
                float a1 = a;
                float b1 = b;
                float c1 = c;
                float n = -b1 / (2 * a1);
                System.out.println("-> Phuong trinh co 1 nghiem kep: " + "x1 = x2 = " + n);
            } else if (delta > 0) {
                float a1 = a;
                float b1 = b;
                float c1 = c;
                double n1 = ((-b1 + Math.sqrt(delta)) / (2 * a1));
                double n2 = ((-b1 - Math.sqrt(delta)) / (2 * a1));
                System.out.println("-> Phuong trinh co 2 nghiem: x1 = " + n1 + " va x2 = " + n2);
            }
        }
    }
}
