package pl.mbulawa.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.mbulawa.restapi.data.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
}
