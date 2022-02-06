package pl.mbulawa.restapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.mbulawa.restapi.data.Orders;
import pl.mbulawa.restapi.repository.OrdersRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrdersService {

    @Autowired
    private final OrdersRepository orderRepository;

    public List<Orders> getOrders() {
        return orderRepository.findAll();
    }

    public Orders getSingleOrder(long orderId) {
        return orderRepository.findById(orderId)
                .orElseThrow();
    }

}


