package com.example.bankapp.api;

import com.example.bankapp.models.User;
import com.example.bankapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RequestMapping("api/v1/user") // our home url
@RestController
public class UserController {

    /**
     * in class you would remove the final from the userService call below
     * and get rid of the autowired constructor beneath it.
     */
    //    @Autowired
    private final UserService userService;

    // Autowired constructor
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * @param user to add a new user with a post request
     */
    @PostMapping
    public void addUser(
        @Valid @NonNull @RequestBody User user) {
        userService.addUser(user);
    }

    /**
     * @return returns the result of the getAllUsers logic from inside UserService
     */
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    /**
     * @param id the id of the user we're looking for as part of the url
     * @return the specified user
     */
    @GetMapping(path = "{id}")
    public User getUserById(
        @PathVariable("id")
            UUID id) {
        return userService.getUserById(id)
            .orElse(null);
    }

    /**
     * deletes the user associated with the given id
     *
     * @param id the id of the user to delete
     */
    @DeleteMapping(path = "{id}")
    public void deleteUserById(
        @PathVariable("id")
            UUID id) {
        userService.deleteUser(id);
    }

    /**
     * @param id           the id passed from the endpoint
     * @param userToUpdate the user associated with the id that was passed
     */
    @PutMapping(path = "{id}")
    public void updateUser(
        @PathVariable("id")
            UUID id,
        @Valid
        @NonNull
        @RequestBody
            User userToUpdate) {
        userService.updateUser(id,
            userToUpdate);
    }
}
