package BT_Sach;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Scanner;

public class BookList {

    ArrayList<Book> bookList = new ArrayList<>();

    public void addBook(Book book) {
        book.addBook();
        bookList.add(book);
        System.out.println("Add success");
    }

    public void displayAllBook() {
        if (bookList.size() == 0) {
            System.out.println("Empty List!");
        } else {
            for (int i = 0; i < bookList.size(); i++) {
                bookList.get(i).displayDetails();
            }
        }
    }

    public void updateBookById(String id) {
        boolean found = true;
        for (int i = 0; i < bookList.size(); i++) {
            if (id.equals(bookList.get(i).getId())) {
                bookList.get(i).updateBookById(id);
                System.out.println("-> Update success");
                break;
            }
        }
        if(!found){
            System.out.println("The book with ID " + id + " not found!");
        }
    }

    public void deleteBookById(String id) {
        boolean found = true;
        for (int i = 0; i < bookList.size(); i++) {
            if (id.equals(bookList.get(i).getId())) {
                bookList.remove(i);
                System.out.println("-> Delete success");
                break;
            }
        }
        if(!found){
            System.out.println("The book with ID " + id + " not found!");
        }
    }

    public void findBookById(String id) {
        boolean found = true;
        for (int i = 0; i < bookList.size(); i++) {
            if (id.equals(bookList.get(i).getId())) {
                System.out.println(bookList.get(i).getId());
                bookList.get(i).displayDetails();
                System.out.println("-> Find success");
                break;
            }
        }
        if(!found){
            System.out.println("The book with ID " + id + " not found!");
        }
    }

    public void findMostExpensiveBook() {
        double max = 0;
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).calculatePrice() > max) {
                max = bookList.get(i).calculatePrice();
            }
        }
        for (int i = 0; i < bookList.size(); i++) {
            if (max == bookList.get(i).calculatePrice()) {
                bookList.get(i).displayDetails();
            }
        }
        System.out.println("-> Find most expensive book success");
    }

    public void countBooks() {
        int countTextBook = 0;
        int countReferenceBook = 0;
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i) instanceof TextBook) {
                countTextBook++;
            } else {
                countReferenceBook++;
            }
        }
        System.out.println("Number of text books: " + countTextBook);
        System.out.println("Number of reference book: " + countReferenceBook);
        System.out.println("Total number of books: " + bookList.size());
        System.out.println("-> Count book success");
    }
}
