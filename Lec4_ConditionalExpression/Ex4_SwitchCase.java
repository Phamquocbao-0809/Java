package Lec4_ConditionalExpression;

import java.util.Scanner;

public class Ex4_SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so tu 2-8: ");
        int number = scanner.nextInt();
        while (number <2 || number > 8){
            System.out.print("Nhap so tu 2-8: ");
            int n2 = scanner.nextInt();
            number = n2;
        }
        switch(number){
            case 2: System.out.println("Thu 2"); break;
            case 3: System.out.println("Thu 3"); break;
            case 4: System.out.println("Thu 4"); break;
            case 5: System.out.println("Thu 5"); break;
            case 6: System.out.println("Thu 6"); break;
            case 7: System.out.println("Thu 7"); break;
            case 8: System.out.println("Chu Nhat"); break; 
        }
    }
}
