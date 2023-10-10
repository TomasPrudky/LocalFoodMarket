package cs.prudkytomas.farmersmarketbe.domain;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Farmer {

    private Long id;
    private String firstName;
    private String secondName;
    private String city;
    private String street;
    private String phone;
    private String email;
}
