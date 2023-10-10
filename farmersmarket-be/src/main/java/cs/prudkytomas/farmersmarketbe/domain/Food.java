package cs.prudkytomas.farmersmarketbe.domain;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Food {

    private Long id;
    private String name;
    private String description;
    private double pricePerUnit;
    private double quantityInStock;
    private String variety;
    private Object photo;

}
