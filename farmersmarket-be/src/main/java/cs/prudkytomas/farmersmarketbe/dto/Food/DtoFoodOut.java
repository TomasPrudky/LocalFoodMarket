package cs.prudkytomas.farmersmarketbe.dto.Food;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoFoodOut {

    private String name;
    private String description;
    private double pricePerUnit;
    private double quantityInStock;
    private String variety;
    private String pathToImage;
}
