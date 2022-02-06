package pl.mbulawa.restapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.mbulawa.restapi.data.Products;
import pl.mbulawa.restapi.repository.ProductsRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductsService {

    @Autowired
    private ProductsRepository productsRepository;

    public List<Products> getProducts() {
        return productsRepository.findAll();
    }

    public Products getSingleProduct(long productId) {
        return productsRepository.findById(productId)
                .orElseThrow();
    }

}
