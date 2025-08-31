package Lec7_String;

import java.util.Scanner;

public class Ex6_FindtheLongestWordinaSentence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String s = scanner.nextLine();
        String t = " ";
        String[] a = s.split(t);
        if (a.length == 1) {
            System.out.println(a[0]);
        }
        int n = 0;
        for (int i = 0; i < a.length; i++) {
            for (int k = i + 1; k < a.length; k++) {
                if (a[i].length() < a[k].length()) {
                    break;
                } else if (a[i].length() >= a[k].length() && k == a.length - 1) {
                    System.out.println(a[i]);
                    n = 1;
                    break;
                }
            }
            if (n == 1) {
                break;
            }
        }
    }
}
