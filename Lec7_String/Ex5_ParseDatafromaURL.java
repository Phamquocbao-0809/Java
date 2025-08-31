package Lec7_String;

import java.util.Scanner;

public class Ex5_ParseDatafromaURL {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap URL: ");
        String s = scanner.nextLine();
        String protocol = s.substring(0, s.indexOf("://"));
        System.out.println("protocol: " + protocol);
        int n1 = s.indexOf("//") + 2;
        String domain = s.substring(n1, s.indexOf("/",n1));
        System.out.println("domain: " + domain);
        String path = s.substring(s.indexOf("/",n1), s.length());
        System.out.println("Path: " + path);
    }
}
