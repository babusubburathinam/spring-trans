package org.z;


import java.util.List;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.z.user.User;
import org.z.user.UserService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/services.xml"})
public class UserServiceTest
{
    @Resource
    private UserService userService = null;

    @Test
    public void testGetAllUsers()
    {
        Assert.assertNotNull(userService);
        List<User> users = userService.getAllUsers();
        Assert.assertEquals(1, users.size());
    }
}
