package Lec4_ConditionalExpression;

import java.util.Scanner;

public class Ex11_QuadraticEquationSolver {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = scanner.nextInt();
        System.out.print("Nhap b: ");
        int b = scanner.nextInt();
        System.out.print("Nhap c: ");
        int c = scanner.nextInt();
        if(a==0){
            double c2 = c;
            double b2 = b;
            double n = -c2/b2;
            System.out.println("Phuong trinh co 1 nghiem: x = " + n);
        } else {
            double delta = Math.pow(b,2) - 4*a*c;
            if(delta<0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if(delta==0) {
                double b2 = b;
                double a2 = a;
                double n = -b/(2*a);
                System.out.println("Phuong trinh co 1 nghiem kep: x1 = x2 = " + n);
            } else if(delta>0) {
                double a2 = a;
                double b2 = b;
                double n1 = (-b + Math.sqrt(delta))/(2*a);
                double n2 = (-b - Math.sqrt(delta))/(2*a);
                System.out.println("Phuong trinh co 2 nghiem: x1 = " + n1 + " va x2 = " + n2);
            }
        }
    }
}
