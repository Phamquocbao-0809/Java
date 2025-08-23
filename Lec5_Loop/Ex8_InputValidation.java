package Lec5_Loop;

import java.util.Scanner;

public class Ex8_InputValidation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number from 1 to 10: ");
        int n = scanner.nextInt();
        do{
            System.out.print("Invalid number, please try again: ");
            n = scanner.nextInt();
        }while(n<1 || n>10);
        System.out.println("You entered the number: " + n);
    }
}
