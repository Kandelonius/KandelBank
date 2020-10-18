package com.example.bankapp.dao;

import com.example.bankapp.models.User;

import java.util.UUID;

public interface UserDao {

    /**
     *
     * @param id long
     * @param user the user
     * @return an int 0 or 1 indicating the user is in the database or not
     */
    int insertUser(UUID id, User user);

    /**
     *
     * @param user the user
     * @return an id
     */
    default long addUser(User user) {
        UUID id = UUID.randomUUID();
        return insertUser(id, user);
    }
}