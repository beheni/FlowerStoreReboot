package apps.ucu.edu.ua.decorators;


import apps.ucu.edu.ua.flower.store.Item;

public class PaperDecorator extends ItemDecorator {
    public PaperDecorator(Item item) {
        this.item = item;
    }
    public String getDescription() {
        return this.item.getDescription() + "Wrapped in";
    }
    public double getPrice() {
        return this.item.getPrice() + 15.0;
    }
}