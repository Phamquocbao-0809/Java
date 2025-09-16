package BT_Sach;

import java.util.Scanner;

public abstract class Book implements IBook {

    private String id;
    private String title;
    private double basePrice;

    public Book() {
    }

    public Book(String id, String title, double basePrice) {
        this.id = id;
        this.title = title;
        this.basePrice = basePrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    @Override
    public void addBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID: ");
        setId(scanner.nextLine());
        System.out.print("Title: ");
        setTitle(scanner.nextLine());
        System.out.print("Base Price: ");
        setBasePrice(Integer.parseInt(scanner.nextLine()));
    }

    public void updateBookById(String id) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Title: ");
        setTitle(scanner.nextLine());
        System.out.print("Base Price: ");
        setBasePrice(Double.parseDouble(scanner.nextLine()));
        setId(id);
    }

    public void displayDetails() {
        System.out.print("ID: " + getId() + ", Title: " + getTitle() + ", Base Price: " + getBasePrice());
    }

    public abstract double calculatePrice();
}
