package Lec4_ConditionalExpression;

import java.util.Scanner;

public class Ex10_AcademicGrading {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap diem: ");
        float diem = scanner.nextFloat();
        if (diem >= 9.0 && diem <= 10) {
            System.out.println("Xuat sac");
        } else if (diem >= 8.0 && diem <= 8.9) {
            System.out.println("Gioi");
        } else if (diem >= 6.5 && diem <= 7.9) {
            System.out.println("Kha");
        } else if (diem >= 5.0 && diem <= 6.4) {
            System.out.println("Trung binh");
        } else if (diem < 5.0) {
            System.out.println("Kem");
        }
    }
}
