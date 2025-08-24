package Lec5_Loop;

import java.util.Scanner;

public class Ex3_DrawaRectanglewithAsterisks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu cao: ");
        int h = scanner.nextInt();
        System.out.print("Nhap chieu rong: ");
        int w = scanner.nextInt();
        for (int h2 = 1; h2 <= h; h2++) {
            for (int w2 = 1; w2 <= w; w2++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
