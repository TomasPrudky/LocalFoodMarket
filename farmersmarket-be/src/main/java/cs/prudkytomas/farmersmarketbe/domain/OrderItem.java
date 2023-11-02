package cs.prudkytomas.farmersmarketbe.domain;

import jakarta.persistence.*;
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

    //@ManyToOne
    //private Food food;
    private int quantity;
    private double price;

    //@ManyToOne
    //private CustomerOrder customerOrder;
}
