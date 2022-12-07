package apps.ucu.edu.ua.decorators;

import apps.ucu.edu.ua.flower.store.Item;

public class RibbonDecorator extends ItemDecorator {
    public RibbonDecorator(Item item) {
        this.item = item;
    }
    public String getDescription() {
        return this.item.getDescription() + " Has a beautiful ribbon on it.";
    }
    public double getPrice() {
        return this.item.getPrice() + 20.0;
    }
}

