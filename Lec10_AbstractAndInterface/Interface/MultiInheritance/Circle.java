
package Lec10_AbstractAndInterface.Interface.MultiInheritance;

public class Circle implements IShape, IColor{
    public void drawShape(){
        System.out.println("Drawing a circle");
    }
    public void fillColor(){
        System.out.println("Filling the circle with green");
    }
}
