package cs.prudkytomas.farmersmarketbe.domain;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    private Long id;
    private Long totalPrice;
    private LocalDateTime orderDate;
    private Object orderItems;
}
