package Bai1;

public class Exercise22 {
    public static void main(String[] args){
        int x = 1;
        int z = x - x-- - x++ + --x - x + x-- + x;
        System.out.println("x = " + x);
        System.out.println("z = " + z);
    }
}
