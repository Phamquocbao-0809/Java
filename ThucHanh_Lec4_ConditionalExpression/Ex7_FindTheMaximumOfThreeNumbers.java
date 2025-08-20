package Lec4_ConditionalExpression;

import java.util.Scanner;

public class Ex7_FindTheMaximumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        int n1 = scanner.nextInt();
        System.out.print("Nhap so thu hai: ");
        int n2 = scanner.nextInt();
        System.out.print("Nhap so thu ba: ");
        int n3 = scanner.nextInt();
        if (n1 >= n2 && n1 >= n3) {
            System.out.println(n1 + " la so lon nhat");
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.println(n2 + " la so lon nhat");
        } else if (n3 >= n1 && n3 >= n2) {
            System.out.println(n3 + " la so lon nhat");
        }
    }
}
