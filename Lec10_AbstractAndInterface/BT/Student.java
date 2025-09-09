package Lec10_AbstractAndInterface.BT;

public class Student extends Human {

    private String studentID;

    Student(String name, String strDate, String sex, String ID) {
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
        System.out.print("Student ID: ");
        studentID = scanner.nextLine();
    }

    public void Output() {
        System.out.print("Name: " + name + ", Date: " + strDate + ", Sex: " + sex + ", ID: " + ID + ", Student ID: " + studentID);
    }

    public void studentRanking() {
        int n;
        System.out.println("Choose rank:");
        System.out.println("1-Excellent, 2-Good, 3-Average, 4-Poor");
        n = scanner.nextInt();
        switch (n) {
            case 1:
                System.out.println("Excellent grade student");
                break;
            case 2:
                System.out.println("Good grade student");
                break;
            case 3:
                System.out.println("Average grade student");
                break;
            case 4:
                System.out.println("Poor grade student");
                break;
        }
    }
}
