package cs.prudkytomas.farmersmarketbe.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class CustomerOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long totalPrice;
    private LocalDateTime orderDate;

    //@OneToOne
    //private AppUser buyer;

    //@OneToOne
    //private Seller seller;

    //@OneToMany
    //private List<Food> orderItems;
}
