package com.example.UserManagementProject.services;

import com.example.UserManagementProject.models.User;
import com.example.UserManagementProject.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.List;
import java.util.Objects;

@Service
public class UserServices {
    @Autowired
    UserDao userDao;

    public String addNewUser(User user) {
        return userDao.save(user);
    }

    public List<User> getAllUsers() {
        return userDao.getUsers();
    }

    public User getUserById(String userid) {
        List<User> helperList = getAllUsers();
        for ( User user : helperList ) {
            if (Objects.equals(user.getUserId(), userid)) {
                return user;
            }
        }
        return null;
    }

    public String deleteUserById(String userid) {
        List<User> helperList = getAllUsers();
        Boolean status = false;

        for ( User user : helperList ) {
            if (Objects.equals(user.getUserId(), userid)) {
                status = userDao.removeUserById(user);
                if ( status ) {
                    return "User " + userid + " removed  successfully.";
                }
                else {
                    return "User " + userid + " cannot be removed from database .";
                }
            }
        }
        return "User " + userid + " Not Found!!!";
    }

    public String updateUser(String userid, User user ) {
        boolean updateStatus =  userDao.updateUserById(userid,user);

        if(updateStatus)
        {
            return "User: " + userid + " was updated.";
        }
        else
        {
            return "User: " + userid + " does not exist.";
        }
    }

}
