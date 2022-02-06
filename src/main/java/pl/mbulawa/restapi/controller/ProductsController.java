package pl.mbulawa.restapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.mbulawa.restapi.data.Products;
import pl.mbulawa.restapi.service.ProductsService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductsController {

    @Autowired
    private final ProductsService productsService;

    @GetMapping("/products")
    private List<Products> getProducts(){return productsService.getProducts();}

    @GetMapping("/products/{productId}")
    private Products getSingleProduct(@PathVariable long productId){
        return productsService.getSingleProduct(productId);
    }
}
