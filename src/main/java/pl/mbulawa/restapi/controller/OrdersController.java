package pl.mbulawa.restapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.mbulawa.restapi.data.Order;
import pl.mbulawa.restapi.service.OrderService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class OrderController {

    @Autowired
    private final OrderService orderService;

    @GetMapping("/orders")
    public List<Order> getOrders(){
        return orderService.getOrders();
    }

    @GetMapping("/orders/{orderId}")
    public Order getSingleOrder(@PathVariable long orderId){
        throw new IllegalArgumentException("Not implemented yet!");
    }
}
