package com.HomeTask15;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static com.HomeTask15.Cashier.serveCustomer;

public class Cashdesk {
    public static void main(String[] args) throws InterruptedException {
        List<Cashier> cashiers = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number of cashiers:");
        int numberOfCashiers = input.nextInt();
        List<Queue<Customer>> customers = new ArrayList<>();
        Queue<Customer> customer = null;
        for (int i = 0; i < numberOfCashiers; i++) {
            customer = new LinkedList<>();
            for (int j = 0; j < 10; j++) {
                customer.add(new Customer("Customer " + (i * 10 + j + 1), 1 + (int) (10 * Math.random()),
                        Customer.getRandomProduct(Product.fillTheProductList())));
            }
            customers.add(customer);
        }

        for (int i = 0; i < numberOfCashiers; i++) {
            cashiers.add(new Cashier("Cashier " + i, customers.get(i)));
        }

        ExecutorService pool = Executors.newFixedThreadPool(numberOfCashiers);
        for (int i = 0; i < numberOfCashiers; i++) {
            Cashier cashier = cashiers.get(i);
            pool.submit(() -> serveCustomer(cashier, cashier.getCustomerQueue()));
        }
        pool.shutdown();


       

    }
}
