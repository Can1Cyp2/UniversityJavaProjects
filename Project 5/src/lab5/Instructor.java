package Project;

import java.util.Locale;

public class Instructor {
    private String name;
    private int phone_ext;
    private String email;

    public Instructor(String person, int phone, String email) {
        this.name = person;
        this.phone_ext = phone;
        this.email = email;
    }

    public Instructor getInstructor(){
        return this;
    }

    public String getName(){
        return this.name;
    }

    public int getPhoneExtension(){
        return this.phone_ext;
    }

    public String getEmail() {
        return this.email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneExtension(int i) {
        this.phone_ext = i;
    }

    public void setEmail(String s) {
        this.email = s;
    }

    public String getInformation() {
        String sentence = "Instructor " + this.name +" has campus phone extension " + this.phone_ext + " and contact email " + this.email;
        return sentence;
    }
}
