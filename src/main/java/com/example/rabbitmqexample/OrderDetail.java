package com.example.rabbitmqexample;

public class OrderDetail {
    private String orderDetailId;
    private int price;
    private String productName;

    public OrderDetail() {
    }

    public OrderDetail(String orderDetailId, int price, String productName) {
        this.orderDetailId = orderDetailId;
        this.price = price;
        this.productName = productName;
    }

    public String getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(String orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
