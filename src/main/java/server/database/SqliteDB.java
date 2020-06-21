package server.database;

import java.sql.*;

public class SqliteDB {
    Connection c = null;
    Statement stmt = null;

    SqliteDB() {
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:UsersDB.db");
            System.out.println("Connected to DB ok");
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    public String listUsers() {
        String list = "";
        try {
            this.stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Users");

            while (rs.next()) {
                int ID = rs.getInt("ID");
                String First_Name = rs.getString("First_Name");
                String Last_Name = rs.getString("Last_Name");
                String mail = rs.getString("mail");
                String Password = rs.getString("Password");

                list = ID + " " + First_Name + " " + Last_Name + " " + mail + " " + Password;
                System.out.println(ID + " " + First_Name + " " + Last_Name + " " + mail + " " + Password);
                return list;
            }
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
        return list;
    }

    public void closeConnection() {
        try {
            c.close();
        } catch (Exception e) {
            System.out.println("Connection not closed");
        }
    }

    public void executeQuery(String query) {
        try {
            this.stmt = c.createStatement();
            stmt.executeQuery(query);

        } catch (Exception e) {

        }

    }
}
