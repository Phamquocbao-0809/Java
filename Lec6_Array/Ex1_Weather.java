package Lec6_Array;

import static java.lang.Math.round;
import java.util.*;

public class Ex1_Weather {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many days' temperatures? ");
        int n = scanner.nextInt();
        int[] weather = new int[n];
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int i2 = i + 1;
            System.out.print("Day " + i2 + "'s high temp: ");
            weather[i] = scanner.nextInt();
            sum = sum + weather[i];
        }
        double average = (double) sum / n;
        System.out.printf("Average temp = %.1f", average);
        for (int i = 0; i < n; i++) {
            if (weather[i] > average) {
                count++;
            }
        }
        System.out.println();
        System.out.println(count + " days were above average");
    }
}
