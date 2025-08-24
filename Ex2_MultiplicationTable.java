package Lec5_Loop;

import java.util.Scanner;

public class Ex2_MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number from 2 - 9: ");
        int n = scanner.nextInt();
        for(int i=1; i<=10;i++){
            int x = n*i;
            System.out.println(n + " * " + i + " = " + x);
        }
    }
}
