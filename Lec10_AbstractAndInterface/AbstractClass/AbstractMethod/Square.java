
package Lec10_AbstractAndInterface.AbstractClass.AbstractMethod;
public class Square extends Shape{
    private double side;
    public Square(double side){
        this.side = side;
    }
    public double calculateArea(){
        return side*side;
    }
}
