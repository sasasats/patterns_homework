package homework4.task5;

import java.sql.ResultSet;
import java.sql.Connection;

public class SomeDatabaseConnection implements DatabaseConnection {
    private Connection connection;

    @Override
    public void connect() {
        // blablabla
    }

    @Override
    public void disconnect() {
        // blablabla
    }

    @Override
    public ResultSet executeQuery(String query) {
        // blablabla
        return null;
    }
}
