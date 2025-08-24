package Lec5_Loop;

import java.util.Random;
import java.util.Scanner;

public class Ex7_NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int r = random.nextInt(100) + 1;
        int n = 0;
        do {
            System.out.print("Your guess: ");
            n = scanner.nextInt();
            if (n > r) {
                System.out.println("Your number is higher than the secret number.");
            } else if (n < r) {
                System.out.println("Your number is lower than the secret number.");
            }
        } while (n != r);
        System.out.println("Congratulations! You guessed correctly!");
    }
}
