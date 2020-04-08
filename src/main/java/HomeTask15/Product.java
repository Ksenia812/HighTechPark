package com.HomeTask15;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private String name;
    private int cost;

    public Product(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return
                name + '\'' +
                        " cost=" + cost;
    }

    public static List<Product> fillTheProductList() {
        List<Product> randomProduct = new ArrayList<>();
        randomProduct.add(new Product("milk", 25));
        randomProduct.add(new Product("bread", 15));
        randomProduct.add(new Product("sausages", 35));
        randomProduct.add(new Product("onions", 19));
        randomProduct.add(new Product("lemons", 28));
        randomProduct.add(new Product("butter", 10));
        randomProduct.add(new Product("cheese", 30));
        randomProduct.add(new Product("sugar", 16));
        randomProduct.add(new Product("tomatoes", 12));
        randomProduct.add(new Product("water", 24));
        randomProduct.add(new Product("potatoes", 21));
        return randomProduct;
    }

}
