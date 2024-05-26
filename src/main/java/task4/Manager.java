package task4;

public class Manager implements User {
    @Override
    public void getPermissions() {
        System.out.println("Manager can manage ticket, prices and routes");
    }
}
