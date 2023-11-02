package cs.prudkytomas.farmersmarketbe.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private double pricePerUnit;
    private double quantityInStock;
    private String variety;
    private String pathToImage;

    //@ManyToOne
    //private AppUser owner;

    //@OneToMany
    //private List<OrderItem> orderItems;
}
