package Lec4_ConditionalExpression;

import java.util.Scanner;

public class Ex6_AgeGroupCategorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so tuoi: ");
        int age = scanner.nextInt();
        while(age<0){
            System.out.print("Nhap so tuoi: ");
            age = scanner.nextInt();
        }
        if (age>=0 && age<=12){
            System.out.println("Child");
        } else if (age>=13 && age <=19) {
            System.out.println("Teenager");
        } else if (age>=20 && age<=59) {
            System.out.println("Adult");
        } else if (age>=60) {
            System.out.println("Senior");
        }
    }
}
