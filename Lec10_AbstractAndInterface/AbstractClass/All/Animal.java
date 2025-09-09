
package Lec10_AbstractAndInterface.AbstractClass.All;

public abstract class Animal {
    private String name;
    public Animal(String name){
        this.name = name;
    }
    public void displayName(){
        System.out.println("Name: " + name);
    }
    public abstract void makeSound();
}
