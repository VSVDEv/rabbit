package com.vsvdev.rabbit.consumer;

import com.vsvdev.rabbit.config.MessagesConfig;
import com.vsvdev.rabbit.dto.OrderStatus;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class User {

    @RabbitListener(queues = MessagesConfig.QUEUE)
    public void consumeMessageFromQueue(OrderStatus orderStatus){
    System.out.println("Message from Queue :  "+orderStatus);
}


}
