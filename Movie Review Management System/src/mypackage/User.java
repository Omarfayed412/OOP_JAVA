/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypackage;

/**
 * Github: https://github.com/Omarfayed412/OOP_JAVA/tree/main/Movie%20Review%20Management%20System
 * @author Omar Fayed
 */
public class User {
    private String Name;
    private String ID;

    public User(String Name, String ID) {
        this.Name = Name;
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public String getID() {
        return ID;
    }
}
