package Lec10_AbstractAndInterface.BT;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Teacher extends Human {

    private String teacherID;

    public Teacher(String name, String strDate, String sex, String ID) {
        super(name, strDate, sex, ID);
    }

    public void Input() {
        System.out.println("Input informations:");
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Date(dd/MM/YYYY): ");
        strDate = scanner.nextLine();
        System.out.print("Sex: ");
        sex = scanner.nextLine();
        System.out.print("ID: ");
        ID = scanner.nextLine();
        System.out.print("Teacher ID: ");
        teacherID = scanner.nextLine();
    }

    public void Output() {
        System.out.print("Name: " + name + ", Date: " + strDate + ", Sex: " + sex + ", ID: " + ID + ", Teacher ID: " + teacherID);
    }

    public void teacherRanking() {
        int n;
        System.out.println("Choose Rank:");
        System.out.println("1-A Grade, 2-B Grade, 3-C Grade, 4-D Grade");
        n = scanner.nextInt();
        switch (n) {
            case 1:
                System.out.println("A grade teacher");
                break;
            case 2:
                System.out.println("B grade teacher");
                break;
            case 3:
                System.out.println("C grade teacher");
                break;
            case 4:
                System.out.println("D grade teacher");
                break;
        }
    }
}
