package Lec5_Loop;

import java.util.Scanner;

public class Ex3_DrawARectangleWithAsterisks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter height: ");
        int h = scanner.nextInt();
        System.out.print("Enter width: ");
        int w = scanner.nextInt();
        for (int i = 1; i <= h; i++) {
            for (int x = 1; x <= w; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
