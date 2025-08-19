package Lec4_ConditionalExpression;
public class Ex1 {
    public static void main(String[] args){
        int x = 42;
        int y= 17;
        int z = 25;
        if(y<x && y<=z){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        
        if(x%2==y%2 || x%2==z%2){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        
        if(x<=y+z && x>=y+z){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        
        if(!(x<y && x<z)){
            System.out.println("True");
        } else{
            System.out.println("False");
        }
        
        if((x+y)%2==0 || !((z-y)%2==0)){
            System.out.println("True");
        } else{
            System.out.println("False");
        }
    }
}
