package com.HomeTask15;

import java.util.*;
//Написать программу,имулирующую работу кассы в магазине.Существует несколько касс,работающих одновременно.
// Каждая касса-отдельный поток.
//Общее кол-во касс может быть юольше,чем покупателей.
//У каждого покупателя есть набор прродуктов,которыу должны быть выведены в процессе обслуживания.
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
