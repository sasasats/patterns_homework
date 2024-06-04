package homework4.task1;

import java.sql.ResultSet;

public interface DatabaseAccess {
    ResultSet executeQuery(String query);
}
