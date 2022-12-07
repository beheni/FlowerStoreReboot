package apps.ucu.edu.ua.springmagic;

import apps.ucu.edu.ua.flower.store.Flower;
import org.springframework.stereotype.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface FlowerRepository extends JpaRepository<Flower, Integer> {


}
