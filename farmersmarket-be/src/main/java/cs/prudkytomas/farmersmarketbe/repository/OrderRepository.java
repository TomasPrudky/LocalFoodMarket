package cs.prudkytomas.farmersmarketbe.repository;

import cs.prudkytomas.farmersmarketbe.domain.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<CustomerOrder, Long> {
}
