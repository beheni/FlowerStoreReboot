package apps.ucu.edu.ua.decorators;


import apps.ucu.edu.ua.flower.store.Item;

public class BasketDecorator extends ItemDecorator {
    public BasketDecorator(Item item) {
        this.item = item;
    }
    public String getDescription() {
        return this.item.getDescription() + " Delivered in a basket.";
    }
    public double getPrice() {
        return this.item.getPrice() + 40.0;
    }
}

