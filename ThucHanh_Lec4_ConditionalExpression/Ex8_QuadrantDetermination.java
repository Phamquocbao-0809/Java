package Lec4_ConditionalExpression;

import java.util.Scanner;

public class Ex8_QuadrantDetermination {

    public static void quadrant(double x, double y) {
        if (x > 0 && y > 0) {
            System.out.println("Toa do nam o mien thu nhat");
        } else if (x < 0 && y > 0) {
            System.out.println("Toa do nam o mien thu hai");
        } else if (x < 0 && y < 0) {
            System.out.println("Toa do nam o mien thu ba");
        } else if (x > 0 && y < 0) {
            System.out.println("Toa do nam o mien thu tu");
        } else if (x == 0 || y == 0) {
            System.out.println("Toa do nam o truc");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap x: ");
        double x = scanner.nextDouble();
        System.out.print("Nhap y: ");
        double y = scanner.nextDouble();
        quadrant(x, y);
    }
}
