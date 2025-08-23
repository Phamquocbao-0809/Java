package Lec5_Loop;

import java.util.Scanner;

public class Ex9_CalculateAverageUntil0IsEntered {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double count = 0;
        int n=1;
        while (n != 0) {
            System.out.print("Enter a number (enter 0 to stop): ");
            n = scanner.nextInt();
            if(n!=0){
            sum = sum + n;
            count++;
            }
        }
        double average = sum / count;
        System.out.println("The average is: " + average);
    }
}
