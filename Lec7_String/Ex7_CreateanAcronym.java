package Lec7_String;

import java.util.Scanner;

public class Ex7_CreateanAcronym {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter phrase: ");
        String phrase = scanner.nextLine();
        String r = " ";
        String[] a = phrase.split(r);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i].charAt(0));
        }
        System.out.println(sb);
    }
}
