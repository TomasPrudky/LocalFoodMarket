package cs.prudkytomas.farmersmarketbe.domain;

import cs.prudkytomas.farmersmarketbe.domain.enums.UnitOfMeasurement;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
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

    @NotBlank(message = "Food name is mandatory")
    private String name;
    private String description;
    private double pricePerUnit;
    private double quantityInStock;
    private String variety;
    private List<String> linksToImages;
    private UnitOfMeasurement unit;

    @ManyToOne
    private AppUser owner;

    //@OneToMany
    //private List<OrderItem> orderItems;
}
