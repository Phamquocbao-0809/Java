package Lec10_AbstractAndInterFace.BT;

import java.util.ArrayList;
import java.util.Scanner;

public class HumanList {

    ArrayList<StringBuilder> a = new ArrayList<>();

    public void inputInformation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter information for? 1 - Student, 2 - Teacher");
        int n2 = scanner.nextInt();
        switch (n2) {
            case 1:
                Student student = new Student("", "", "", "");
                student.Input();
                student.studentRanking();
                StringBuilder sb = new StringBuilder();
                sb.append("Name: " + student.getName() + ", Date: " + student.getDate() + ", Sex: " + student.getSex() + ", ID: " + student.getID() + ", Student ID: " + student.getStudentID() + ", Rank: " + student.getRank());
                a.add(sb);
                break;
            case 2:
                Teacher teacher = new Teacher("", "", "", "");
                teacher.Input();
                teacher.teacherRanking();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Name: " + teacher.getName() + ", Date: " + teacher.getDate() + ", Sex: " + teacher.getSex() + ", ID: " + teacher.getID() + ", Teacher ID: " + teacher.getTeacherID() + ", Rank: " + teacher.getRank());
                a.add(sb2);
                break;
        }
    }
    public void outputInformation(){
        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i));
        }
    }
}
