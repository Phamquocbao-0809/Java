package Individual_Project;

import java.util.Date;

public class Student {

    private String id;
    private String name;
    private String birthday;
    private String address;
    private String email;

    public Student(String id, String name, String birthday, String address, String email) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.email = email;
    }

    // Getter & Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
