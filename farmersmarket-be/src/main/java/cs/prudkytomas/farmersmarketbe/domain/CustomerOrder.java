package cs.prudkytomas.farmersmarketbe.domain;

import cs.prudkytomas.farmersmarketbe.domain.enums.OrderStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
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

    @NotBlank
    @Min(0)
    private Long totalPrice;

    @NotBlank
    private LocalDateTime orderDate;

    @NotBlank
    private OrderStatus status;

    @NotBlank
    @OneToOne
    private AppUser buyer;

    @NotBlank
    @OneToOne
    private AppUser seller;

    @NotBlank
    @OneToMany
    private List<OrderItem> orderItems;
}
