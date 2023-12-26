package cs.prudkytomas.farmersmarketbe.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String city;

    @NotBlank
    private String zipcode;

    @NotBlank
    private String street;

    @NotBlank
    private String houseNumber;

    @OneToOne
    private AppUser appUser;
}
