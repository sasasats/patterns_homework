package homework4.task1;

import java.sql.ResultSet;

public class ProxyDatabaseAccess implements DatabaseAccess {
    private RealDatabaseAccess realDatabaseAccess;
    private boolean isProdEnv;

    public ProxyDatabaseAccess(boolean isProdEnv) {
        this.isProdEnv = isProdEnv;
        this.realDatabaseAccess = new RealDatabaseAccess();
    }

    @Override
    public ResultSet executeQuery(String query) {
        if (isProdEnv) {
            // some actions
            return null;
        } else {
            return null;
        }
    }
}
