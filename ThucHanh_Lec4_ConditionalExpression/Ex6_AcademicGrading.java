package Lec4_ConditionalExpression;

import java.util.Scanner;

public class Ex6_AcademicGrading {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap diem: ");
        float score = scanner.nextFloat();
        if (score >= 9 && score <= 10) {
            System.out.println("Xuat sac");
        } else if (score >= 8 && score <= 8.9) {
            System.out.println("Gioi");
        } else if (score >= 6.5 && score <= 7.9) {
            System.out.println("Kha");
        } else if (score >= 5 && score <= 6.4) {
            System.out.println("Trung binh");
        } else if (score < 5) {
            System.out.println("Kem");
        }
    }
}
