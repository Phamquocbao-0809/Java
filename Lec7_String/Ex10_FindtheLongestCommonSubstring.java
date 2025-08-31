package Lec7_String;

import java.util.Scanner;

public class Ex10_FindtheLongestCommonSubstring {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi 1: ");
        String s1 = scanner.nextLine();
        System.out.print("Nhap chuoi 2: ");
        String s2 = scanner.nextLine();
        int n = 0;
        String s3 = "";
        String s4 = "";
        if(s1.length() > s2.length()){
            s3 = s2;
            s4 = s1;
            n = s2.length();
        } else {
            s3 = s1;
            s4 = s2;
            n = s1.length();
        }
        String kq="";
            for (int i = 0; i < n ; i++) {
                for (int k = i + 1; k <= n; k++) {
                    String t = s3.substring(i, k);
                    if (s4.contains(t)) {
                        if (t.length() > kq.length()) {
                            kq = t;
                        }
                    }
                }
            }
        System.out.println(kq);
    }
}
