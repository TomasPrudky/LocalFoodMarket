package cs.prudkytomas.farmersmarketbe.controller;

import cs.prudkytomas.farmersmarketbe.dto.AppUser.DtoAppUserIn;
import cs.prudkytomas.farmersmarketbe.service.AppUserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/app-user")
@AllArgsConstructor
public class AppUserController {

    private final AppUserService appUserService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getAppUser(@PathVariable Long id){
        return ResponseEntity.ok(appUserService.getAppUser(id));
    }

    @PostMapping()
    public ResponseEntity<?> createAppUser(@RequestBody DtoAppUserIn dto){
        return ResponseEntity.ok(appUserService.createAppUser(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateAppUser(@PathVariable Long id){
        return ResponseEntity.ok(null);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteAppUser(@PathVariable Long id){
        return ResponseEntity.ok(null);
    }
}
