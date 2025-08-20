package Lec4_ConditionalExpression;

import java.util.Scanner;

public class Ex10_TriangleClassifier {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap canh thu nhat: ");
        int c1 = scanner.nextInt();
        System.out.print("Nhap canh thu hai: ");
        int c2 = scanner.nextInt();
        System.out.print("Nhap canh thu ba: ");
        int c3 = scanner.nextInt();
        if(c1+c2>c3 && c1+c3>c2 && c2+c3>c1){
            if(c1==c2 && c1==c3){
                System.out.println("Day la tam giac deu");
            } else if(c1==c2 || c2==c3 || c3==c1){
                System.out.println("Day la tam giac can");
            } else {
                System.out.println("Day la tam giac thuong");
            }
        } else {
            System.out.println("Day khong phai la tam giac");
        }
    }
}
