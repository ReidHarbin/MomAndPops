package com.momandpops.restaurant;

import java.util.Objects;

public class User {
    private int PhoneNumber;
    private String Name;

    public User() {

    }

    public User(int PhoneNumber, String Name) {
        this.PhoneNumber = PhoneNumber;
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return getPhoneNumber() == user.getPhoneNumber() && Objects.equals(getName(), user.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPhoneNumber(), getName());
    }
}
