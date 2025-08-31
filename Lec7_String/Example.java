
package Lec7_String;
public class Example {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(s.substring(6));
        System.out.println(s.substring(0,5));
        System.out.println(s.substring(1,3));
        
        String s1 = " Sachin ";
        System.out.println(s1);
        System.out.println(s1.trim());
        
        String s3 = "Duy Tan ";
        String s4 = s3.concat("University");
        System.out.println(s3);
        
        String s5 = "Duy Tan ";
        s5 = s5.concat("University");
        System.out.println(s5);
        
        String s6 = "hello";
        String s7 = "HELLO";
        System.out.println(s6.equals(s7));
        System.out.println(s6.equalsIgnoreCase(s7));
    }
}
