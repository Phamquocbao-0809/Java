package Lec5_Loop;

import java.util.Scanner;

public class Ex4_DrawARightAngledTriangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap h: ");
        int h = scanner.nextInt();
        int c = 1;
        for(int i=1;i<=h;i++){
            for(int x=1; x<=c ; x++){
                System.out.print(x);
            }
            c++;
            System.out.println();
        }
    }
}
