package cs.prudkytomas.farmersmarketbe.service;

import cs.prudkytomas.farmersmarketbe.repository.OrderItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrderItemService {

    private OrderItemRepository orderItemRepository;

    public void getAllOrderItems(){
        orderItemRepository.findAll();
    }

    public void getOrderItem(Long id){
        orderItemRepository.findById(id).orElse(null);
    }

    public void createOrderItem(){

    }

    public void updateOrderItem(Long id){

    }

    public void deleteOrderItem(Long id){
        orderItemRepository.deleteById(id);
    }
}
