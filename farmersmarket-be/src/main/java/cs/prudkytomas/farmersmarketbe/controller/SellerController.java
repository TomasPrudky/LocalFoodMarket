package cs.prudkytomas.farmersmarketbe.controller;

import cs.prudkytomas.farmersmarketbe.dto.Seller.DtoSellerIn;
import cs.prudkytomas.farmersmarketbe.serivce.SellerService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/seller/")
public class SellerController {

    private final SellerService sellerService;

    @GetMapping
    public ResponseEntity<?> getAllSellers(){
        return ResponseEntity.ok(sellerService.getAllSellers());
    }

    @GetMapping("{id}")
    public ResponseEntity<?> getSeller(@PathVariable Long id){
        return ResponseEntity.ok(sellerService.getSeller(id));
    }

    @PostMapping
    public ResponseEntity<?> createSeller(@RequestBody DtoSellerIn dtoSellerIn){
        return ResponseEntity.ok(sellerService.createSeller(dtoSellerIn));
    }

    @PutMapping("{id}")
    public ResponseEntity<?> updateSeller(@PathVariable Long id, @RequestBody DtoSellerIn dtoSellerIn){
        return ResponseEntity.ok(sellerService.updateSeller(id, dtoSellerIn));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteSeller(@PathVariable Long id){
        return ResponseEntity.ok(sellerService.deleteSeller(id));
    }
}
