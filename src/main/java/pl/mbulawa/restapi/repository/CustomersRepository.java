package pl.mbulawa.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.mbulawa.restapi.data.Customers;

@Repository
public interface CustomersRepository extends JpaRepository<Customers, Long>{
}
