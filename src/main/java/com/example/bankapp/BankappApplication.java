package com.example.bankapp;

import com.example.bankapp.models.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankappApplication {

    public static void main(String[] args) {

//         public User(
//            String firstname,
//            char middleinitial,
//            String lastname,
//            String address,
//            String city,
//            String state,
//            int age,
//            boolean married,
//            double balance)

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

//        User bob new User("Bob")

        System.out.println(carol.getAddress());
        System.out.println("Last name is " + carol.getLastname());
        carol.setLastname("Smith");
        System.out.println("Last name is now " + carol.getLastname());
        System.out.println(jim.getId());
        System.out.println(jim.getBalance());
//        carol.setBalance(carol.getBalance() += 10);
//        System.out.println(carol.getBalance() += 10);

        SpringApplication.run(BankappApplication.class,
            args);
    }
}

