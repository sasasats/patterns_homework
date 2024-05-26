package task5.facade;

import task5.lib.CommonItemCreator;
import task5.lib.CommonItemUpdater;
import task5.lib.ItemCreator;
import task5.lib.ItemUpdater;

public class ItemFacade {
    private ItemCreator itemCreator;
    private ItemUpdater itemUpdater;

    public ItemFacade() {
        this.itemCreator = new CommonItemCreator();
        this.itemUpdater = new CommonItemUpdater();
    }

    public void createCompleteItem(int id, String name, String description, double price) {
        itemCreator.createPlaceholder();
        itemUpdater.updateId(id);
        itemUpdater.updateName(name);
        itemUpdater.updateDescription(description);
        itemUpdater.updatePrice(price);
    }
}
