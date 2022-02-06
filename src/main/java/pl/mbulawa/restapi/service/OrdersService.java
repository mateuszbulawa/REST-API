package pl.mbulawa.restapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.mbulawa.restapi.data.Order;
import pl.mbulawa.restapi.repository.OrdersRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrdersRepository orderRepository;

    public List<Order> getOrders() {
        return orderRepository.findAll();
    }
}


