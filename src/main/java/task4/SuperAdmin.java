package task4;

public class SuperAdmin implements User {
    @Override
    public void getPermissions() {
        System.out.println("Super administrator has all administrative privileges");
    }
}
