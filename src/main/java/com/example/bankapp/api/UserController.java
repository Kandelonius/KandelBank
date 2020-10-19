package com.example.bankapp.api;

import com.example.bankapp.models.User;
import com.example.bankapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/user")
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

    @PostMapping
    public void addUser(
        @RequestBody
            User user) {
        userService.addUser(user);
    }
}
