package org.example.TopBrains;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    @Test
    public void testGetDetails() {

        User user = new User("U101", "Pavan Kumar",
                "pavan@gmail.com", "Admin");

        String expected = "User ID: U101, Name: Pavan Kumar, Email: pavan@gmail.com, Role: Admin";

        String actual = user.getDetails();

        assertEquals(expected, actual);
    }
    @Test
    public void testUserIdNotNull() {

        User user = new User("U102", "Ravi",
                "ravi@gmail.com", "User");

        assertNotNull(user.getUserId());
    }
}
