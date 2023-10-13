package cs.prudkytomas.farmersmarketbe.dto.AppUser;

import cs.prudkytomas.farmersmarketbe.domain.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoAppUserOut {

    private String username;
    private String email;
    private Role role;
}
