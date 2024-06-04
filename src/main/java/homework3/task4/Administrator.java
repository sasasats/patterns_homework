package homework3.task4;

public class Administrator implements User {
    @Override
    public void getPermissions() {
        System.out.println("Administrator can manage users and system settings");
    }
}
