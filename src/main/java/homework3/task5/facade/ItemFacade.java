package homework3.task5.facade;

import homework3.task5.lib.CommonItemCreator;
import homework3.task5.lib.CommonItemUpdater;
import homework3.task5.lib.ItemCreator;
import homework3.task5.lib.ItemUpdater;

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
