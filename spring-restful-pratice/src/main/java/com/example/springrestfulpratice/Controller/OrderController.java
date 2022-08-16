package com.example.springrestfulpratice.Controller;

import com.example.springrestfulpratice.Controller.Dto.Request.Order.CreatOrderRequest;
import com.example.springrestfulpratice.Controller.Dto.Request.Order.UpdateOrderRequest;
import com.example.springrestfulpratice.Modle.Entity.Order;
import com.example.springrestfulpratice.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping()
    public List<Order> getAllOrder() {
        List<Order> orderList = this.orderService.getOrder();
        return orderList;
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable int id) {
        Order order = this.orderService.getOrderById(id);
        return order;
    }

    @PostMapping
    public String creatOrder(@RequestBody CreatOrderRequest order) {
        return orderService.creatOrder(order);
    }

    @PutMapping("/{id}")
    public String updateOrder(@PathVariable int id, @RequestBody UpdateOrderRequest order) {
        // Order updateOrder=this.orderService.updateOrder(id, order);
        return orderService.updateOrder(id, order);
    }

    @DeleteMapping("/{id}")
    public String deleteOrder(@PathVariable int id) {

        return orderService.deleteOrder(id);
    }
}
