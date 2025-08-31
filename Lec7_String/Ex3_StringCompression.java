package Lec7_String;

import java.util.Scanner;

public class Ex3_StringCompression {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        int dem = 0;
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            if (i < s.length() - 1) {
                char c2 = s.charAt(i + 1);
                if (c1 == c2) {
                    dem++;
                } else if (c1 != c2) {
                    dem++;
                    sb.append(c1).append(dem);
                    dem = 0;
                }
            } else {
                dem++;
                sb.append(c1).append(dem);
            }
        }
        System.out.println(sb);
    }
}