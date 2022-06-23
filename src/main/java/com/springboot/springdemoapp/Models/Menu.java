package com.springboot.springdemoapp.Models;

public class Menu {
    private int id;
    private String foodName;
    private int foodPrice;

    public Menu(int id, String foodName, int foodPrice) {
        this.id = id;
        this.foodName = foodName;
        this.foodPrice = foodPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(int foodPrice) {
        this.foodPrice = foodPrice;
    }
}
