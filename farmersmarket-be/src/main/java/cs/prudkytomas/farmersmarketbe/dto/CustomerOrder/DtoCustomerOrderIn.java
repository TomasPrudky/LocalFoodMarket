package cs.prudkytomas.farmersmarketbe.dto.CustomerOrder;

import cs.prudkytomas.farmersmarketbe.domain.Food;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoCustomerOrderIn {

    private Food food;
    private int quantity;
    private double price;
}

