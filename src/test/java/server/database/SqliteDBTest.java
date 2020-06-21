package server.database;

import org.junit.Test;

import static org.junit.Assert.*;

public class SqliteDBTest {

    @Test
    public void listUsers() {
        SqliteDB db = new SqliteDB();
        String query = "INSERT INTO Users(ID, First_Name, Last_Name, mail, Password) VALUES (0001, \"Filippo\", \"Perolo\", \"perolo@et.esiea.fr\", \"password\")";
        assertEquals(db.listUsers(), "0001 Filippo Perolo perolo@et.esiea.fr password");
    }

    @Test
    public void closeConnection() {
        SqliteDB db = new SqliteDB();
        String query = "INSERT INTO Users(ID, First_Name, Last_Name, mail, Password) VALUES (0001, \"Filippo\", \"Perolo\", \"perolo@et.esiea.fr\", \"password\")";
    }

    @Test
    public void executeQuery() {
        SqliteDB db = new SqliteDB();
        String query = "INSERT INTO Users(ID, First_Name, Last_Name, mail, Password) VALUES (0001, \"Filippo\", \"Perolo\", \"perolo@et.esiea.fr\", \"password\")";
    }
}