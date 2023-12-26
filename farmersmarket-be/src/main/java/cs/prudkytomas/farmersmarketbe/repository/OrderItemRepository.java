package cs.prudkytomas.farmersmarketbe.repository;

import cs.prudkytomas.farmersmarketbe.domain.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
