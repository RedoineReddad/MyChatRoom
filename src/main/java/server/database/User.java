package server.database;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {
    private int id;
    private String firstName;
    private String surname;
    private String ipAddress;
    private List<User> contactsList;

    public User(int id, String firstName, String surname, String ipAddress) {
        this.id = id;
        this.firstName = firstName;
        this.surname = surname;
        this.ipAddress = ipAddress;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public List<User> getContactsList() {
        return contactsList;
    }


}
