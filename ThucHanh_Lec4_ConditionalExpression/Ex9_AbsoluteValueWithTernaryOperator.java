package Lec4_ConditionalExpression;

import java.util.Scanner;

public class Ex9_AbsoluteValueWithTernaryOperator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap gia tri: ");
        int number = scanner.nextInt();
        int gTTD = (number>=0) ? number : -number;
        System.out.println("Gia tri tuyet doi la: " + gTTD);
    }
}
