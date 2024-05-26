package task5.lib;

public class CommonItemUpdater implements ItemUpdater {
    @Override
    public void updateId(int id) {
        System.out.println("Updating item id to " + id);
    }

    @Override
    public void updateName(String name) {
        System.out.println("Updating item name to " + name);
    }

    @Override
    public void updateDescription(String description) {
        System.out.println("Updating item description to " + description);
    }

    @Override
    public void updatePrice(double price) {
        System.out.println("Updating item price to " + price);
    }
}
