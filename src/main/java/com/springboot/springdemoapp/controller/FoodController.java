package com.springboot.springdemoapp.controller;

import com.springboot.springdemoapp.Models.Menu;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FoodController {
    @GetMapping("/menu")
    public List<Menu> listOfFoodItem(){
        List<Menu> menus = new ArrayList<>();
        Menu foodNumber1 = new Menu(1,"Rice",50);
        menus.add(foodNumber1);
        Menu foodNumber2 = new Menu(2,"idly",30);
        menus.add(foodNumber2);
        Menu foodNumber3 = new Menu(1,"Dosa",30);
        menus.add(foodNumber3);
        Menu foodNumber4 = new Menu(1,"Friedrice",60);
        menus.add(foodNumber4);
        Menu foodNumber5 = new Menu(1,"Biryani",90);
        menus.add(foodNumber5);

        return menus;
    }

}
