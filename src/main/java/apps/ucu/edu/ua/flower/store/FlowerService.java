package apps.ucu.edu.ua.flower.store;

import apps.ucu.edu.ua.flower.store.Flower;
import apps.ucu.edu.ua.flower.store.FlowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FlowerService {
    @Autowired
    private FlowerRepository flowerRepository;

    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    public List<Flower> getFlowers() {
        return flowerRepository.findAll();
    }
    public void addFlower(Flower flower) {
        flowerRepository.save(flower);
    }
}
