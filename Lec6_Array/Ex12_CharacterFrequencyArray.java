package Lec6_Array;

import java.util.Scanner;

public class Ex12_CharacterFrequencyArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] a = new String[26];
        int[] a2 = new int[26];
        a[0] = "a";
        a[1] = "b";
        a[2] = "c";
        a[3] = "d";
        a[4] = "e";
        a[5] = "f";
        a[6] = "g";
        a[7] = "h";
        a[8] = "i";
        a[9] = "j";
        a[10] = "k";
        a[11] = "l";
        a[12] = "m";
        a[13] = "n";
        a[14] = "o";
        a[15] = "p";
        a[16] = "q";
        a[17] = "r";
        a[18] = "s";
        a[19] = "t";
        a[20] = "u";
        a[21] = "v";
        a[22] = "w";
        a[23] = "x";
        a[24] = "y";
        a[25] = "z";
        System.out.print("Nhap mot dong(khong viet hoa): ");
        String a3 = scanner.nextLine();
        for (int i = 0; i < a3.length(); i++) {
            char c = a3.charAt(i);
            String s = String.valueOf(c);
            for (int j = 0; j < a.length; j++) {
                if (s.equals(a[j])) {
                    a2[j]++;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a2[i] != 0) {
                System.out.println(a[i] + ": " + a2[i]);
            }
        }
    }
}
