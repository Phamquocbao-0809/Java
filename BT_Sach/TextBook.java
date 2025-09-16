package BT_Sach;

import java.util.Scanner;

public class TextBook extends Book {

    private String subject;

    public TextBook() {
    }

    public TextBook(String subject) {
        this.subject = subject;
    }

    public TextBook(String subject, String id, String title, double basePrice) {
        super(id, title, basePrice);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void addBook() {
        Scanner scanner = new Scanner(System.in);
        super.addBook();
        System.out.print("Subject: ");
        setSubject(scanner.nextLine());
    }

    public void updateBookById(String id) {
        Scanner scanner = new Scanner(System.in);
        super.updateBookById(id);
        System.out.print("Subject: ");
        setSubject(scanner.nextLine());
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println(", Text book price: " + calculatePrice() + ", Subject: " + getSubject());
    }

    public double calculatePrice() {
        return super.getBasePrice() + super.getBasePrice() * 0.1;
    }

}
