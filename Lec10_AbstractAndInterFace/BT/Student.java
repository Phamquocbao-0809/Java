package Lec10_AbstractAndInterFace.BT;

import java.util.Scanner;

public class Student extends Human {

    Scanner scanner = new Scanner(System.in);
    public String studentID;
    String rank;

    Student(String name, String strDate, String sex, String ID) {
        super(name, strDate, sex, ID);
    }

    public void Input() {
        System.out.println("Enter student information:");
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Date: ");
        strDate = scanner.nextLine();
        System.out.print("Sex: ");
        sex = scanner.nextLine();
        System.out.print("ID: ");
        ID = scanner.nextLine();
        System.out.print("Student ID: ");
        studentID = scanner.nextLine();
    }

    public void Output() {
        System.out.println("Name: " + name + ", Date: " + strDate + ", Sex: " + sex + ", ID: " + ID + ", Student ID: " + studentID + ", Rank: " + rank);
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    public String getRank(){
        return rank;
    }

    public void studentRanking() {
        System.out.println("Student Ranking:");
        System.out.println("1-Excellent, 2-Good, 3-Average, 4-Poor");
        int n = scanner.nextInt();
        switch (n) {
            case 1:
                System.out.println("Excellent student grade");
                rank = "Excellent student grade";
                break;
            case 2:
                System.out.println("Good student grade");
                rank = "Good student grade";
                break;
            case 3:
                System.out.println("Average student grade");
                rank = "Average student grade";
                break;
            case 4:
                System.out.println("Poor student grade");
                rank = "Poor student grade";
                break;
        }
    }
}
