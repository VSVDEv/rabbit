package com.vsvdev.rabbit.dto;

import java.util.Objects;

public class OrderStatus {

private Order order;
private String status;
private String message;


    public OrderStatus(Order order, String status, String message) {
        this.order = order;
        this.status = status;
        this.message = message;
    }

    public OrderStatus() {
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderStatus that = (OrderStatus) o;
        return Objects.equals(order, that.order) &&
                Objects.equals(status, that.status) &&
                Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order, status, message);
    }

    @Override
    public String toString() {
        return "OrderStatus{" +
                "order=" + order +
                ", status='" + status + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
