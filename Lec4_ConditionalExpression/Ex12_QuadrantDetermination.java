package Lec4_ConditionalExpression;

import java.util.Scanner;

public class Ex12_QuadrantDetermination {

    public static void quadrant(double x, double y) {
        if (x > 0 && y > 0) {
            System.out.println("Toa do o mien thu 1");
        } else if (x < 0 && y > 0) {
            System.out.println("Toa do o mien thu 2");
        } else if (x < 0 && y < 0) {
            System.out.println("Toa do o mien thu 3");
        } else if (x > 0 && y < 0) {
            System.out.println("Toa do o mien thu 4");
        } else if (x == 0 && y == 0) {
            System.out.println("Toa do o truc O");
        } else if (x == 0 || y == 0) {
            System.out.println("Toa do nam tren truc");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap x: ");
        float x = scanner.nextFloat();
        System.out.print("Nhap y: ");
        float y = scanner.nextFloat();
        quadrant(x, y);
    }
}
