package com.example.bankapp;

import com.example.bankapp.models.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankappApplication {
    //    public User(
    //        String firstname,
    //        String lastname,
    //        String address,
    //        String city,
    //        String state,
    //        int age,
    //        boolean married)

    public static void main(String[] args) {

        User carol = new User("Carol",
            'c',
            "Bannister",
            "any string",
            "string",
            "state",
            90,
            false);

        System.out.println(carol.getAddress());
        System.out.println("Last name is " + carol.getLastname());
        carol.setLastname("Smith");
        System.out.println("Last name is now " + carol.getLastname());

        SpringApplication.run(BankappApplication.class,
            args);
    }
}

