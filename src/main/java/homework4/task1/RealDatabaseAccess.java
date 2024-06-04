package homework4.task1;

import java.sql.Connection;
import java.sql.ResultSet;

public class RealDatabaseAccess implements DatabaseAccess {
    private Connection connection;

    public RealDatabaseAccess() {
        // Constructor
    }

    @Override
    public ResultSet executeQuery(String query) {
        // Do some actions
        return null;
    }
}
