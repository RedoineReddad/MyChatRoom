import java.sql.Connection;
import java.sql.SQLException;

public class testDB {

    public static void main(String[] args) throws SQLException {

        String query1 = "INSERT INTO Users(ID, First_Name, Last_Name, mail, Password) VALUES (0001, \"Filippo\", \"Perolo\", \"perolo@et.esiea.fr\", \"password\")";

        SqliteDB db = new SqliteDB();

        db.executeQuery(query1);

        db.listUsers();

        db.closeConnection();
    }
}
