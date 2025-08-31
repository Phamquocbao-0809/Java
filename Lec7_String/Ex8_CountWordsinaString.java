
package Lec7_String;

import java.util.Scanner;

public class Ex8_CountWordsinaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        String s2 = s.trim();
        String r = " ";
        String[] a = s2.split(r);
        System.out.println("The number of words in the string is: " + a.length);
    }
}
