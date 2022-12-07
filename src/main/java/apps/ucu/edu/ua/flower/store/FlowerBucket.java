package apps.ucu.edu.ua.flower.store;
import lombok.Getter;
import java.util.ArrayList;
public class FlowerBucket extends Item {
    @Getter
    private ArrayList<FlowerPack> packList = new ArrayList<FlowerPack>();
    private double price;
    public FlowerBucket() {
        price = 0;
    }
    public void add(FlowerPack pack) {
        packList.add(pack);
        price += pack.getPrice();
    }
    public double getPrice() {
        return price;
    }

    @Override
    public double price() {
        return price;
    }
}
