package pl.mbulawa.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.mbulawa.restapi.data.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Long> {
}
