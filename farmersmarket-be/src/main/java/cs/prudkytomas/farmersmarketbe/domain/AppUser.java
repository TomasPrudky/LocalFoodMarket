package cs.prudkytomas.farmersmarketbe.domain;

import cs.prudkytomas.farmersmarketbe.domain.enums.Role;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    @NotBlank(message = "Username is mandatory")
    @Size(min = 5, message = "Username should be min. 5 characters length")
    private String username;

    @NotBlank(message = "Password is mandatory")
    @Size(min = 5, message = "Password should be min. 5 characters length")
    private String password;

    @Column(unique = true)
    @NotBlank(message = "Email is mandatory")
    @Email(message = "Email should be valid")
    private String email;

    private String firstname;
    private String lastname;

    @OneToOne
    private Address address;

    private Role role;
    private String mobile;

    @OneToMany(mappedBy = "owner")
    private List<Food> products;

    @ManyToMany
    private List<CustomerOrder> orders;
}
