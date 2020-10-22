package com.example.bankapp.dao;

import com.example.bankapp.models.User;

import java.util.List;
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
    default int insertUser(User user) {
        UUID id = UUID.randomUUID();
        return insertUser(id, user);
    }

    public List<User> selectAllUsers();
}
