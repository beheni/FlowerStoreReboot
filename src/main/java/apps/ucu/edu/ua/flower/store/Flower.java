package apps.ucu.edu.ua.flower.store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Flower extends Item{
    @Id
    @GeneratedValue
    private int id;
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public String getColor() {
        return color.toString();
    }
    public String getType() { return flowerType.toString(); }

    @Override
    public double price() {
        return price;
    }
}
