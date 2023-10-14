package cs.prudkytomas.farmersmarketbe.dto.Seller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoSellerIn {

    private String fullName;
    private String city;
    private String street;
    private String phone;
    private String email;
}
