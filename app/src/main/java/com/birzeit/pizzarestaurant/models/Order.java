package com.birzeit.pizzarestaurant.models;

public class Order {
    private String pizzaName;
    private String size;
    private String price;
    private String date;
    private String time;

    public Order() {

    }

    public Order(String pizzaName, String size, String price, String date, String time) {
        this.pizzaName = pizzaName;
        this.size = size;
        this.price = price;
        this.date = date;
        this.time = time;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
