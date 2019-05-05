package com.birzeit.pizzarestaurant.models;

public class Pizza {
    private String name;
    private String type;
    private String summary;
    private boolean offer;
    private String smallPrice;
    private String medium;
    private String largePrice;

    public Pizza() {

    }

    public Pizza(String name, String type, String summary, boolean offer, String smallPrice, String medium, String largePrice) {
        this.name = name;
        this.type = type;
        this.summary = summary;
        this.offer = offer;
        this.smallPrice = smallPrice;
        this.medium = medium;
        this.largePrice = largePrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public boolean isOffer() {
        return offer;
    }

    public void setOffer(boolean offer) {
        this.offer = offer;
    }

    public String getSmallPrice() {
        return smallPrice;
    }

    public void setSmallPrice(String smallPrice) {
        this.smallPrice = smallPrice;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getLargePrice() {
        return largePrice;
    }

    public void setLargePrice(String largePrice) {
        this.largePrice = largePrice;
    }
}
