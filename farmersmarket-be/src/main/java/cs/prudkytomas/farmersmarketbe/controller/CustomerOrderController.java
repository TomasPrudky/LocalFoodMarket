package cs.prudkytomas.farmersmarketbe.controller;

import cs.prudkytomas.farmersmarketbe.domain.CustomerOrder;
import cs.prudkytomas.farmersmarketbe.serivce.CustomerOrderService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order/")
@AllArgsConstructor
public class CustomerOrderController {

    private final CustomerOrderService customerOrderService;

    public ResponseEntity<?> getAllOrders(){
        return ResponseEntity.ok(customerOrderService.getAllOrders());
    }
}
