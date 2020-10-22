package com.example.bankapp.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class User {

    // holds our max id ensuring we always have a unique user id
    // private static long maxId = 0;
    // private long id; // long is 8 bytes which is 64 bits

    // fields
    private UUID id;

    private String firstname;

    private char middleinitial;

    private String lastname;

    private String address;

    private String city;

    private String state;

    private int age; // int is 4 bytes which is 16 bits

    private boolean married;

    private double balance; // 8 bytes can contain decimal

    private String sons_name;

    /**
     * constructor created for manual insertion of a user
     */
    public User(
        String firstname,
        char middleinitial,
        String lastname,
        String address,
        String city,
        String state,
        int age,
        boolean married,
        double balance) {
        //        maxId++;
        //        id = maxId;
        this.firstname = firstname;
        this.middleinitial = middleinitial;
        this.lastname = lastname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.age = age;
        this.married = married;
        this.balance = 100.00;
    }

    /**
     * constructor created for dao method
     */
    public User(
        @JsonProperty("id")
            UUID id,
        @JsonProperty("name")
            String firstname) {
        this.id = id;
        this.firstname = firstname;
    }

    // getters and setters used for data management
    // we don't have a setter for id because we are creating that for the user and it shouldn't change
    public UUID getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public char getMiddleinitial() {
        return middleinitial;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
        //        return lastname;
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

    public void setMiddleinitial(char middleinitial) {
        this.middleinitial = middleinitial;
    }

    public String getSons_name() {
        return sons_name;
    }

    public void setSons_name(String sons_name) {
        this.sons_name = sons_name;
    }

    @Override
    public String toString() {
        return "User{" +
            "id=" + id +
            ", firstname='" + firstname + '\'' +
            '}';
    }
}

