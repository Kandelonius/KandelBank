package com.example.bankapp.models;

public class User {
    // holds our max id ensuring we always have a unique user id
    private static long maxId = 0;

    private long id; // long is 8 bytes which is 64 bits

    private String firstname;

    private String lastname;

    private String address;

    private String city;

    private String state;

    private int age; // int is 4 bytes which is 16 bits

    private boolean married;

    private double balance; // 8 bytes can contain decimal

    public User(
        String firstname,
        String lastname,
        String address,
        String city,
        String state,
        int age,
        boolean married) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.age = age;
        this.married = married;
    }

    public long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

