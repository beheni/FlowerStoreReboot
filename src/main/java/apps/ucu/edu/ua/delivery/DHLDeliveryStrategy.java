package apps.ucu.edu.ua.delivery;

import lombok.ToString;

import java.util.LinkedList;
import java.util.Map;

@ToString
public class DHLDeliveryStrategy implements Delivery{
    @Override
    public void deliver(LinkedList items) {
        System.out.println("Your order was delivered by DHL delivery");

    }

    @Override
    public double getPrice() {
        return 33;
    }

    @Override
    public boolean setOrder() {
        return true;
    }

    @Override
    public Map<String, String> getDescription() {
        return Map.of("Type", "DHL", "Price", String.valueOf(this.getPrice()));
    }
}
