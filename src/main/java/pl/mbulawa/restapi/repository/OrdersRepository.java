package pl.mbulawa.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.mbulawa.restapi.data.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Long> {
}
