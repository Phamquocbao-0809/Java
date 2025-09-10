package Lec10_AbstractAndInterFace.BT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HumanList l = new HumanList();
        int n = 0;
        do {
            l.inputInformation();
            System.out.println("Continue? 1-yes, 2-no");
            n = scanner.nextInt();
        } while (n != 2);
        if(n==2){
            l.outputInformation();
        }
    }
}
