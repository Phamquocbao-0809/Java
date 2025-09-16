package BT_Sach;

import java.awt.BorderLayout;
import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookList bookList = new BookList();
        int continueChoose;
        do {
            System.out.println("\nMENU:");
            System.out.println("0. Exit");
            System.out.println("1. Add list");
            System.out.println("2. Display list");
            System.out.println("3. Update list");
            System.out.println("4. Delete list");
            System.out.println("5. Find book");
            System.out.println("6. Find the most expensive book");
            System.out.println("7. Count book");
            System.out.print("Choose method: ");
            continueChoose = Integer.parseInt(scanner.nextLine());
            switch (continueChoose) {
                case 0:
                    System.out.println("Exit!");
                    break;
                case 1:
                    System.out.println("Add a book to the list:");
                    System.out.print("Add which? 1-Text book, 2-Reference book: ");
                    int chooseBook = Integer.parseInt(scanner.nextLine());
                    if (chooseBook == 1) {
                        TextBook textBook = new TextBook();
                        bookList.addBook(textBook);
                    } else if (chooseBook == 2) {
                        ReferenceBook referenceBook = new ReferenceBook();
                        bookList.addBook(referenceBook);
                    } else {
                        System.out.println("Wrong enter");
                    }
                    break;
                case 2:
                    System.out.println("\nList of all books:");
                    bookList.displayAllBook();
                    break;
                case 3:
                    System.out.print("Enter the ID of the book to be updated: ");
                    bookList.updateBookById(scanner.nextLine());
                    break;
                case 4:
                    System.out.print("Enter the ID of the book to be deleted: ");
                    bookList.deleteBookById(scanner.nextLine());
                    break;
                case 5:
                    System.out.print("Enter the ID of the book you are looking for: ");
                    bookList.findBookById(scanner.nextLine());
                    break;
                case 6:
                    System.out.println("The most expensive book is:");
                    bookList.findMostExpensiveBook();
                    break;
                case 7:
                    bookList.countBooks();
                    break;
                default:
                    System.out.println("Invalid selection, please select again");
                    break;
            }
            System.out.print("Continue? 1-yes, 0-no: ");
            continueChoose = Integer.parseInt(scanner.nextLine());
        } while (continueChoose != 0);
    }
}
