package apps.ucu.edu.ua.delivery;

import java.util.LinkedList;
import java.util.Map;

public interface Delivery {
    void deliver(LinkedList items);
    double getPrice();
    boolean setOrder();
    Map<String,String> getDescription();

}