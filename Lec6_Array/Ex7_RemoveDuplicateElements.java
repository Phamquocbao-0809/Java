package Lec6_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex7_RemoveDuplicateElements {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        a.get(1);
        a.get(3);
        a.get(2);
        a.get(1);
        a.get(4);
        a.get(3);
        a.get(5);
        ArrayList<Integer> b = new ArrayList<>();
        for(int i=0;i<a.size()-1;i++){
            for(int k=1;k<a.size();k++){
                if(a.get(i) == a.get(k)){
                    b.get(a.get(i));
                }
            }
        }
        System.out.print("Before:");
        for(int i=0;i<a.size();i++){
            System.out.print(" " + a.get(i));
        }
        System.out.println();
        System.out.print("After:");
        for(int i=0;i<b.size();i++){
            System.out.print(" " + b.get(i));
        }
    }
}
