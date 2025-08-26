package Lec6_Array;

import java.util.Scanner;

public class Ex3_CountOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of values: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int i2 = i + 1;
            System.out.print(i2 + " value: ");
            a[i] = scanner.nextInt();
        }
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            if (i != n - 1) {
                System.out.print(a[i] + ", ");
            } else {
                System.out.print(a[i]);
            }
        }
        System.out.println("]");
        System.out.print("Number to find X = ");
        int x = scanner.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(a[i]==x){
                count++;
            }
        }
       System.out.println("The number " + x + " appears " + count + " time");
    }
}
