package com.HomeTask15;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private int spentTime;
    private List<Product> productList ;


    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Customer(String name, int spentTime, List<Product> productList) {
        this.name = name;
        this.spentTime = spentTime;
        this.productList = productList;
    }

    public String getName() {
        return name;
    }

    public int getSpentTime() {
        return spentTime;
    }

    public static List<Product> getRandomProduct(List<Product> products) {
        List<Product> randomProductList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int randomIndex = (int)(Math.random() * products.size());
            randomProductList.add(products.get(randomIndex));
        }
        return randomProductList;
    }


    @Override
    public String toString() {
        StringBuffer products = new StringBuffer(", who bought products (");
        for (Product product : getProductList()) {
            products.append(product + "; ");
        }
        return getName() + " " + products + ")";
    }
}
