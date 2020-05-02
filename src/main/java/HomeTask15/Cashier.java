package com.HomeTask15;

import java.util.Queue;

public class Cashier extends Thread {
    private Queue<Customer> customerQueue;


    public Cashier(String name, Queue<Customer> customerQueue) {
        super(name);
        this.customerQueue = customerQueue;

    }


    static void serveCustomer(Cashier cashier, Queue<Customer> customerQueue) {
        while (!customerQueue.isEmpty()) {
            try {
                Customer currentCustomer = null;


                currentCustomer = customerQueue.poll();
                System.out.println(cashier + " have started to serve " + currentCustomer);
                Thread.sleep(500 * currentCustomer.getSpentTime());
                System.out.println(currentCustomer.getName() + " was served by " + cashier);

            } catch (InterruptedException e) {
                System.out.println("The cash is unavailable ");
            }
        }
    }

    @Override
    public String toString() {
        return getName();
    }

    public Queue<Customer> getCustomerQueue() {
        return customerQueue;
    }

    public void setCustomerQueue(Queue<Customer> customerQueue) {
        this.customerQueue = customerQueue;
    }
}
