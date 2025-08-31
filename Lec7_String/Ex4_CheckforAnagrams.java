package Lec7_String;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4_CheckforAnagrams {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi 1: ");
        String s1 = scanner.nextLine();
        s1 = s1.toLowerCase();
        System.out.print("Nhap chuoi 2: ");
        String s2 = scanner.nextLine();
        s2 = s2.toLowerCase();
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        if (a1.length != a2.length) {
            System.out.println("The two strings are not Anagrams.");
        } else if (a1.length == a2.length) {
            for (int i = 0; i < a1.length; i++) {
                if(a1[i] != a2[i]){
                    System.out.println("The two strings are not Anagrams.");
                    break;
                }
                if(i == a1.length-1 && a1[i] == a2[i]) {
                    System.out.println("The two strings are Anagrams.");
                }
            }
        }
    }
}
