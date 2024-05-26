package task4.decorators;

import task4.User;

public class SupplierUserDecorator extends UserDecorator {
    public SupplierUserDecorator(User user) {
        super(user);
    }

    @Override
    public void getPermissions() {
        decoratedUser.getPermissions();
        addSupplierPermissions();
    }

    private void addSupplierPermissions() {
        System.out.println("SupplierUser can manage their own ticket offers and availability");
    }
}
