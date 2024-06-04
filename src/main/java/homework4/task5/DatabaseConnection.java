package homework4.task5;

import java.sql.ResultSet;

public interface DatabaseConnection {
    void connect();
    void disconnect();
    ResultSet executeQuery(String query);
}
