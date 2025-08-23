package Lec5_Loop;

import java.util.Random;
import java.util.Scanner;

public class Ex7_NumberGuessingGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = random.nextInt(100)+1;
        int i = 0;
        do{
            System.out.print("Your guess: ");
            i = scanner.nextInt();
            if(i>n){
                System.out.println("Your number is higher than the secret number");
            } else if(i<n){
                System.out.println("Your number is lower than the secret number");
            }
        }while(i!=n);
        System.out.println("Congratulations! You guessed correctly!");
    }
}
