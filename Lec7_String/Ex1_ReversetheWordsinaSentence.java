package Lec7_String;

import java.util.Scanner;

public class Ex1_ReversetheWordsinaSentence {

    public static void main(String[] args) {
        System.out.print("Nhap mot dong: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String r = " ";
        String[] a = s.split(r);
        StringBuilder sb = new StringBuilder();
        for (int i = a.length - 1; i >= 0; i--) {
            if (i != 0) {
                sb.append(a[i] + " ");
            } else {
                sb.append(a[i]);
            }
        }
        System.out.println(sb);
    }
}
