package cs.prudkytomas.farmersmarketbe.serivce;

import cs.prudkytomas.farmersmarketbe.domain.AppUser;
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
        return convertToDto(appUserRepository.getReferenceById(id));
    }

    private DtoAppUserOut convertToDto(AppUser appUser) {
        DtoAppUserOut dtoURLRecord = modelMapper.map(appUser, DtoAppUserOut.class);
        return dtoURLRecord;
    }
}
