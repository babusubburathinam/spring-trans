package org.z.user.impl;

import org.springframework.stereotype.Service;
import org.z.user.User;
import org.z.user.UserService;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService
{

    @Override
    public List<User> getAllUsers()
    {
        User user = new User();
        user.setId(1L);
        user.setName("test");

        List<User> users = new ArrayList<User>();
        users.add(user);
        return users;
    }
}
