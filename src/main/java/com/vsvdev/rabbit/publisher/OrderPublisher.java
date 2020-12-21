package com.vsvdev.rabbit.publisher;

import com.vsvdev.rabbit.config.MessagesConfig;
import com.vsvdev.rabbit.dto.Order;
import com.vsvdev.rabbit.dto.OrderStatus;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/order")
public class OrderPublisher {



    private final RabbitTemplate template;

    @Autowired
    public OrderPublisher(RabbitTemplate template) {
        this.template = template;
    }

    @PostMapping("/{restaurantName}")
    public String bookOrder(@RequestBody Order order, @PathVariable String restaurantName){
        order.setOrderId(UUID.randomUUID().toString());
        OrderStatus orderStatus= new OrderStatus(order,"Process",
                "order was created sucessfully in  "+restaurantName);
        template.convertAndSend(MessagesConfig.EXCHANGE, MessagesConfig.ROUTING_KEY, orderStatus);
        return "Success!!!";
    }
}
