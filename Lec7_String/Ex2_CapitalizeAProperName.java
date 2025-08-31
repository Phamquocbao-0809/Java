package Lec7_String;

import java.util.Locale;
import java.util.Scanner;

public class Ex2_CapitalizeAProperName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        String s = scanner.nextLine();
        String r = " ";
        String[] a = s.split(r);
        String[] a2 = new String[a.length];
        for (int i = 0; i < a.length; i++) {
            a2[i] = a[i].toLowerCase();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a2.length; i++) {
            String t = a2[i].substring(0,1);
            t = t.toUpperCase();
            if (i != a2.length - 1) {
                sb.append(t + a2[i].substring(1) + " ");
            } else {
                sb.append(t + a2[i].substring(1));
            }
        }
        System.out.println(sb);
    }
}