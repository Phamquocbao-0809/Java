package Lec5_Loop;

import java.util.Scanner;

public class Ex9_CalculateAverageUntil0isEntered {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = -2;
        double sum = 0;
        int count = 0;
        do {
            System.out.print("Enter a number (enter 0 to stop): ");
            n = scanner.nextInt();
            if(n!=0){
            sum = sum + n;
            count++;
            }
        } while (n != 0);
        double average = sum / count;
        System.out.println("The average is: " + average);
    }
}
