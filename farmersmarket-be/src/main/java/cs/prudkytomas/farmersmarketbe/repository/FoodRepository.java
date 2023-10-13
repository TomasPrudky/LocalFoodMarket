package cs.prudkytomas.farmersmarketbe.repository;

import cs.prudkytomas.farmersmarketbe.domain.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {
}
