package homework3.task4.decorators;

import homework3.task4.User;

public class RegulatoryUserDecorator extends UserDecorator {
    public RegulatoryUserDecorator(User user) {
        super(user);
    }

    @Override
    public void getPermissions() {
        decoratedUser.getPermissions();
        addRegulatoryPermissions();
    }

    private void addRegulatoryPermissions() {
        System.out.println("RegulatoryUser can audit system data and compliance reports");
    }
}
