package BT_Sach;

import java.util.Scanner;

public class ReferenceBook extends Book {

    private String publisher;

    public ReferenceBook() {
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void addBook() {
        Scanner scanner = new Scanner(System.in);
        super.addBook();
        System.out.print("Publisher: ");
        setPublisher(scanner.nextLine());
    }

    @Override
    public double calculatePrice() {
        return getBasePrice() + getBasePrice() * 0.1;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println(", Reference book price: " + calculatePrice() + ", Publisher: " + getPublisher());
    }

    public void updateBookById(String id) {
        Scanner scanner = new Scanner(System.in);
        super.updateBookById(id);
        System.out.print("Publisher: ");
        setPublisher(scanner.nextLine());
    }
}
