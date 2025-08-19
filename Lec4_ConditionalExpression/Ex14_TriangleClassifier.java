package Lec4_ConditionalExpression;

import java.util.Scanner;

public class Ex14_TriangleClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap canh thu 1: ");
        int c1 = scanner.nextInt();
        System.out.print("Nhap canh thu 2: ");
        int c2 = scanner.nextInt();
        System.out.print("Nhap canh thu 3: ");
        int c3 = scanner.nextInt();
        if(c1+c2>c3 && c1+c3>c2 && c2+c3>c1){
            if(c1==c2 && c2==c3){
                System.out.println("Day la tam giac deu");
            } else if(c1==c2 || c2==c3 || c3==c1){
                System.out.println("Day la tam giac can");
            } else if(c1!=c2 && c1!=c3 && c2!=c3){
                System.out.println("Day la tam giac thuong");
            }
        } else {
            System.out.println("Khong the tao thanh hinh tam giac");
        }
    }
}
