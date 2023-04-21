package com.example.UserManagementProject.repository;

import com.example.UserManagementProject.models.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class UserDao {
    List<User> userList = new ArrayList<>();

    public String save(User user) {
        userList.add(user);
        return " User Added Successfully .";
    }

    public List<User> getUsers() {
        return userList;
    }

    public Boolean removeUserById(User user) {
        userList.remove(user);
        return true;
    }

    public Boolean updateUserById(String userid, User user) {
        for (User userObj : userList) {
            if (Objects.equals(userObj.getUserId(), userid)) {
                userObj.setUserName(user.getUserName());
                userObj.setAddress(user.getAddress());
                userObj.setPhoneNumber(user.getPhoneNumber());
                return true;
            }
        }
        return false;

    }
}
