package com.example.bankapp.dao;

import com.example.bankapp.models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FakeUserDataAccessService implements UserDao {

    private static List<User> DB = new ArrayList<>();

    @Override
    public int insertUser(
        UUID id,
        User user) {

        DB.add(new User(id, user.getFirstname()));
        return 1;
    }
}
