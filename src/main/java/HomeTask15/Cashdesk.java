package com.HomeTask15;

import java.util.*;

public class Cashdesk {
    public static void main(String[] args) throws InterruptedException {
        List<Cashier> cashiers = new LinkedList<>();
        Queue<Customer> customers = new LinkedList<>();
        List<Product> productVariety = new ArrayList<>();


        for (int i = 0; i < 3; i++) {
            cashiers.add(new Cashier("Cashier " + i, customers));
        }

        for (int i = 0; i < 10; i++) {
            synchronized (customers) {
                customers.add(new Customer("Customer " + i, 1 + (int) (10 * Math.random()),
                        Customer.getRandomProduct(Product.fillTheProductList())));
            }
        }

        synchronized (customers) {
            while (!customers.isEmpty()) {
                customers.wait();
            }
        }

        System.out.println("All customers have been served");

    }
}
