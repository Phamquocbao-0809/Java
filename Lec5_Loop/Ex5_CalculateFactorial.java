package Lec5_Loop;

import java.util.Scanner;

public class Ex5_CalculateFactorial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        while(n<0){
            System.out.print("Nhap n: ");
            n = scanner.nextInt();
        }
        int f = 1;
        for(int i=1;i<=n;i++){
            f = f*i;
        }
        System.out.println("Giai thua cua " + n + " la: " + f);
    }
}
