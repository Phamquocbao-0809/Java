package Lec10_AbstractAndInterFace.BT;

import java.util.Scanner;

public class Teacher extends Human {

    Scanner scanner = new Scanner(System.in);
    private String teacherID;
    String rank;

    public Teacher(String name, String strDate, String sex, String ID) {
        super(name, strDate, sex, ID);
    }

    public void Input() {
        System.out.println("Enter teacher information:");
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Date: ");
        strDate = scanner.nextLine();
        System.out.print("Sex: ");
        sex = scanner.nextLine();
        System.out.print("ID: ");
        ID = scanner.nextLine();
        System.out.print("Teacher ID: ");
        teacherID = scanner.nextLine();
    }

    public void Output() {
        System.out.println("Name: " + name + ", Date: " + strDate + ", Sex: " + sex + ", ID: " + ID + ", Teacher ID: " + teacherID + ", Rank: " + rank);
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }
    public String getRank(){
        return rank;
    }

    public void teacherRanking() {
        System.out.println("Teacher Ranking:");
        System.out.println("1-A grade, 2-B grade, 3-C grade, 4-D grade");
        int n = scanner.nextInt();
        switch (n) {
            case 1:
                System.out.println("A teacher grade");
                rank = "A teacher grade";
                break;
            case 2:
                System.out.println("B teacher grade");
                rank = "B teacher grade";
                break;
            case 3:
                System.out.println("C teacher grade");
                rank = "C teacher grade";
                break;
            case 4:
                System.out.println("D teacher grade");
                rank = "D teacher grade";
                break;
        }
    }
}
