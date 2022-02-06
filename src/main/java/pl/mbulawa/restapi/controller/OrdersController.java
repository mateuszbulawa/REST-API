package pl.mbulawa.restapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.mbulawa.restapi.data.Orders;
import pl.mbulawa.restapi.service.OrdersService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class OrdersController {

    @Autowired
    private final OrdersService ordersService;

    @GetMapping("/orders")
    public List<Orders> getOrders(){
        return ordersService.getOrders();
    }

    @GetMapping("/orders/{orderId}")
    public Orders getSingleOrder(@PathVariable long orderId){
        return ordersService.getSingleOrder(orderId);
    }
}
