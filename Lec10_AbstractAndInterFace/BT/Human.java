package Lec10_AbstractAndInterFace.BT;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Human {

    String name;
    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    String strDate = formatter.format(date);
    String sex;
    String ID;

    public Human(String name, String strDate, String sex, String ID) {
        this.name = name;
        this.strDate = strDate;
        this.sex = sex;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return strDate;
    }

    public void setDate(String date) {
        strDate = date;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public abstract void Input();

    public abstract void Output();
}
