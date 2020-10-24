package com.example.bankapp;

import com.example.bankapp.models.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankappApplication {

    public static void main(String[] args) {

        SpringApplication.run(BankappApplication.class,
            args);
        demo();
    }

    public static void demo() {

        /*
         * Note: these users will not be added to the database.
         */
        User carol = new User("Carol",
            'c',
            "Bannister",
            "any string",
            "string",
            "state",
            90,
            false,
            12.70);

        User jim = new User("Jim",
            'j',
            "Bannister",
            "any string",
            "string",
            "state",
            90,
            false,
            125);

        System.out.println(carol.getAddress());
        System.out.println("Last name is " + carol.getLastname());
        carol.setLastname("Smith");
        System.out.println("Last name is now " + carol.getLastname());
        System.out.println("Jim's id is " + jim.getId());
        System.out.println("Jim's balance is " + jim.getBalance());
        System.out.println("Carol's balance is " + carol.getBalance());
        carol.setBalance(carol.getBalance() + 10);
        System.out.println("Carol's balance is now " + carol.getBalance());
    }
}

