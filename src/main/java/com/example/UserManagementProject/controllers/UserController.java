package com.example.UserManagementProject.controllers;

import com.example.UserManagementProject.models.User;
import com.example.UserManagementProject.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserServices userService;

    @PostMapping(value = "/addUser")
    public String addUser(@RequestBody User user) {
        return userService.addNewUser(user);
    }

    @GetMapping(value = "/getAllUser")
    public List<User> getAllUser() {
        return userService.getAllUsers();
    }

    @GetMapping(value = "getUser/{userid}")
    public User getUser(@PathVariable String userid) {
        return userService.getUserById(userid);
    }

    @PutMapping(value = "/updateUserInfo/{userid}")
    public String updateUserInfo(@PathVariable String userid, @RequestBody User user) {
        return userService.updateUser(userid, user);
    }

    @DeleteMapping(value = "/deleteUser/{userid}")
    public String deleteUser(@PathVariable String userid) {
        return userService.deleteUserById(userid);
    }
}
