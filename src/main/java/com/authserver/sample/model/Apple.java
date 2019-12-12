package com.authserver.sample.model;

public class Apple {

    private Long id;
    private String type;
    private int price;

    public Apple() {
    }

    public Apple(Long id, String type, int price) {
        this.id = id;
        this.type = type;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
