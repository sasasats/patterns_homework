package homework3.task4.decorators;

import homework3.task4.User;

public abstract class UserDecorator implements User {
    protected final User decoratedUser;

    public UserDecorator(User user) {
        this.decoratedUser = user;
    }

    @Override
    public void getPermissions() {
        decoratedUser.getPermissions();
    }
}
