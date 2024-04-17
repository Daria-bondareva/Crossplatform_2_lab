package org.example.crossplat_lab1.Method_1;
public class User{
    private String  Name;
    private String  Surname;
    public User(String Name, String Surname){
        this.Name = Name;
        this.Surname = Surname;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }
}