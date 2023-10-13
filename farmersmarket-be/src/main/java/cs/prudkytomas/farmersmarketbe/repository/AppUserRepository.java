package cs.prudkytomas.farmersmarketbe.repository;

import cs.prudkytomas.farmersmarketbe.domain.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long> {
}
