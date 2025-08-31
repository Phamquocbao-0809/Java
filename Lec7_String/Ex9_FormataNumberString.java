package Lec7_String;

import java.util.Scanner;

public class Ex9_FormataNumberString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        String n = scanner.nextLine();
        StringBuilder sb = new StringBuilder(n);
        int dem = 0;
        for (int i = n.length()-1; i >= 0; i--) {
            dem++;
            if (dem == 3 && i!=0) {
                sb.insert(i, ",");
                dem = 0;
            }
        }
        System.out.println(sb);
    }
}
