package pl.mbulawa.restapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.mbulawa.restapi.data.Customers;
import pl.mbulawa.restapi.service.CustomersService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CustomerControllers {

    @Autowired
    private final CustomersService customerService;

    @GetMapping("/customers")
    public List<Customers> getCustomers() {
        return customerService.getCustomers();
    }

    @GetMapping("/customers/{customerId}")
    public Customers getSingleCustomer(@PathVariable long customerId) {
        return customerService.getSingleCustomer(customerId);
    }

}
