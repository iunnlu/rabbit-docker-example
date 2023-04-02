package com.example.rabbitmqexample;

import java.util.List;

public class Order {
    private String orderId;
    private int price;
    private List<OrderDetail> orderDetails;

    public Order() {
    }

    public Order(String orderId, int price, List<OrderDetail> orderDetails) {
        this.orderId = orderId;
        this.price = price;
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", price=" + price +
                ", orderDetails=" + orderDetails +
                '}';
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }
}