package pl.mbulawa.restapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.mbulawa.restapi.data.Customers;
import pl.mbulawa.restapi.repository.CustomersRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomersService {

    private final CustomersRepository customerRepository;

    public List<Customers> getCustomers() {
        return customerRepository.findAll();
    }

    public Customers getSingleCustomer(long customerId) {
        return customerRepository.findById(customerId)
                .orElseThrow();
    }
}
