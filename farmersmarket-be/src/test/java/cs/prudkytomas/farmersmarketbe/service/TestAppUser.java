package cs.prudkytomas.farmersmarketbe.service;

import cs.prudkytomas.farmersmarketbe.dto.AppUser.DtoAppUserIn;
import cs.prudkytomas.farmersmarketbe.dto.AppUser.DtoAppUserOut;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

@SpringBootTest
public class TestAppUser {

    @Autowired
    private AppUserService appUserService;

    @Test
    public void testCreateAppUser(){
        DtoAppUserIn dtoIn = new DtoAppUserIn("adam123", "password", "email@email.com");
        DtoAppUserOut outDto = appUserService.createAppUser(dtoIn);

        Assert.hasText(outDto.getEmail(), dtoIn.getEmail());
    }
}
