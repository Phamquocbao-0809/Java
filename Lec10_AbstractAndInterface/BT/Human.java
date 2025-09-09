
package Lec10_AbstractAndInterface.BT;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Human {
    Scanner scanner = new Scanner(System.in);
    public String name;
    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    public String strDate = formatter.format(date);
    public String sex;
    public String ID;
    public Human(String name, String strDate, String sex, String ID){
        this.name = name;
        this.strDate = strDate;
        this.sex = sex;
        this.ID = ID;
    }
    public abstract void Input();
    public abstract void Output();
}
