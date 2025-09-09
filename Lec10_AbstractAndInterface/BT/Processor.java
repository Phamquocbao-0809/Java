package Lec10_AbstractAndInterface.BT;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n2 = 0;
        do {
            System.out.print("Enter information for: 1 - Student, 2 - Teacher: ");
            int n = scanner.nextInt();
            switch (n) {
                case 1:
                    Student student = new Student("", "", "", "");
                    student.Input();
                    student.studentRanking();
                    student.Output();
                    System.out.println();
                    System.out.println("Continue? 1-yes, 2-no");
                    n2 = scanner.nextInt();
                    break;
                case 2:
                    Teacher teacher = new Teacher("", "", "", "");
                    teacher.Input();
                    teacher.teacherRanking();
                    teacher.Output();
                    System.out.println();
                    System.out.println("Continue? 1-yes, 2-no");
                    n2 = scanner.nextInt();
                    break;
            }
        } while (n2 != 2);
    }
}
