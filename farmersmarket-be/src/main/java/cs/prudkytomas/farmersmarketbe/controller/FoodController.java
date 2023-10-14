package cs.prudkytomas.farmersmarketbe.controller;

import cs.prudkytomas.farmersmarketbe.dto.Food.DtoFoodIn;
import cs.prudkytomas.farmersmarketbe.dto.Food.DtoFoodOut;
import cs.prudkytomas.farmersmarketbe.serivce.FoodService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/food")
@AllArgsConstructor
public class FoodController {

    private final FoodService foodService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getFood(@PathVariable Long id){
        return ResponseEntity.ok(foodService.getFood(id));
    }

    @GetMapping("/")
    public ResponseEntity<?> getFood(){
        return ResponseEntity.ok(foodService.getFood());
    }

    @PostMapping("/")
    public ResponseEntity<?> createFood(@RequestBody DtoFoodIn dtoFoodIn){
        return ResponseEntity.ok(foodService.createFood(dtoFoodIn));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteFood(@PathVariable Long id){
        return ResponseEntity.ok(foodService.deleteFood(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateFood(@PathVariable Long id, @RequestBody DtoFoodIn dtoFoodIn){
        return ResponseEntity.ok(foodService.updateFood(id, dtoFoodIn));
    }
}
