package cs.prudkytomas.farmersmarketbe.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @ManyToOne
    private Food food;

    @Min(1)
    @NotBlank
    private int quantity;

    @Min(0)
    @NotBlank
    private double price;

    @NotBlank
    @ManyToOne
    private CustomerOrder customerOrder;
}
