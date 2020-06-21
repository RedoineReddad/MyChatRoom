package server.database;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {



    @Test
    public void getId() {
        User user = new User(0, "redoine", "reddad", "192.168.1.10");
        assertEquals(user.getId(), 0);
    }

    @Test
    public void getFirstName() {
        User user = new User(0, "redoine", "reddad", "192.168.1.10");
        assertEquals(user.getFirstName(), "redoine");

    }

    @Test
    public void getSurname() {
        User user = new User(0, "redoine", "reddad", "192.168.1.10");
        assertEquals(user.getSurname(), "reddad");
    }

    @Test
    public void getIpAddress() {
        User user = new User(0, "redoine", "reddad", "192.168.1.10");
        assertEquals(user.getIpAddress(), "192.168.1.10");

    }

}