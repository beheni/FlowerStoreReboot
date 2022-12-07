package apps.ucu.edu.ua.flower.store;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {
    protected String description;
    protected double price;
    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return this.price;
    }
}
