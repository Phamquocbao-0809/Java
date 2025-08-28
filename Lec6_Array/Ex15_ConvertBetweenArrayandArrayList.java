
package Lec6_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex15_ConvertBetweenArrayandArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cho ArrayList: ");
        int n1 = scanner.nextInt();
        ArrayList<String> a1 = new ArrayList<>();
        scanner.nextLine();
        for(int i=0;i<n1;i++){
            int i2=i+1;
            System.out.print("Nhap phan tu thu " + i2 + "(ArrayList): ");
            String n = scanner.nextLine();
            a1.add(n);
        }
        System.out.println(Arrays.toString(a1.toArray()));
        System.out.println("ArrayList -> Array");
        String[] a2 = new String[a1.size()];
        for(int i=0;i<a2.length;i++){
            a2[i] = a1.get(i);
        }
        System.out.println(Arrays.toString(a2));
        
        System.out.print("Nhap so phan tu cho Array: ");
        int n2 = scanner.nextInt();
        String[] a3 = new String[n2];
        scanner.nextLine();
        for(int i=0;i<a3.length;i++){
            int i2=i+1;
            System.out.print("Nhap phan tu thu " + i2 + "(Array): ");
            a3[i] = scanner.nextLine();
        }
        System.out.println(Arrays.toString(a3));
        System.out.println("Array -> ArrayList");
        ArrayList<String> a4 = new ArrayList<>();
        for(int i=0;i<a3.length;i++){
            a4.add(a3[i]);
        }
        System.out.println(Arrays.toString(a4.toArray()));
    }
}
