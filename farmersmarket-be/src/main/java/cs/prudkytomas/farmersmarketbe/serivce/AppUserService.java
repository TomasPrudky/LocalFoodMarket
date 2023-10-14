package cs.prudkytomas.farmersmarketbe.serivce;

import cs.prudkytomas.farmersmarketbe.domain.AppUser;
import cs.prudkytomas.farmersmarketbe.domain.Role;
import cs.prudkytomas.farmersmarketbe.dto.AppUser.DtoAppUserIn;
import cs.prudkytomas.farmersmarketbe.dto.AppUser.DtoAppUserOut;
import cs.prudkytomas.farmersmarketbe.repository.AppUserRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AppUserService {

    private final AppUserRepository appUserRepository;
    private final ModelMapper modelMapper;

    public DtoAppUserOut getAppUser(Long id) {
        return convertToDto(appUserRepository.findById(id).orElse(null));
    }



    public DtoAppUserOut createAppUser(DtoAppUserIn dto) {
        AppUser appUser = new AppUser();
        appUser.setUsername(dto.getUsername());
        appUser.setEmail(dto.getEmail());
        appUser.setPassword(dto.getPassword());
        appUser.setRole(Role.USER);

        return convertToDto(appUserRepository.save(appUser));
    }

    private DtoAppUserOut convertToDto(AppUser appUser) {
        DtoAppUserOut dtoURLRecord = modelMapper.map(appUser, DtoAppUserOut.class);
        return dtoURLRecord;
    }

}
