package Lec6_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex4_ToDoListManagemen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> toDo = new ArrayList<>();
        int n = -2;
        do {
            System.out.println();
            System.out.println("1. Add a new task.");
            System.out.println("2. View all tasks.");
            System.out.println("3. Remove a task by its position(index).");
            System.out.println("0. Exit.");
            n = scanner.nextInt();
            scanner.nextLine();
            if (n == 1) {
                System.out.print("Add: ");
                String s = scanner.nextLine();
                toDo.add(s);
            } else if (n == 2) {
                System.out.println("View list: ");
                if (toDo.isEmpty()) {
                    System.out.println("No tasks yet");
                } else {
                    for (int i = 0; i < toDo.size(); i++) {
                        System.out.println(i + " - " + toDo.get(i));
                    }
                }
            } else if (n == 3) {
                System.out.println("List: ");
                for (int i = 0; i < toDo.size(); i++) {
                    System.out.println(i + " - " + toDo.get(i));
                }
                System.out.print("Remove: ");
                int a = scanner.nextInt();
                for (int i = 0; i < toDo.size(); i++) {
                    if (a == i) {
                        toDo.remove(i);
                    }
                }
            }
        } while (n != 0);
        System.out.println("You exit");
    }
}
