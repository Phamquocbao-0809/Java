package Lec5_Loop;

import java.util.Scanner;

public class Ex6_SumofDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        int sOD = 0;
        for(int i=0;i<=15;i++){
            sOD = sOD + n%10;
            n = n/10;
        }
        System.out.println("The sum of the digits is: " + sOD);
    }
}
