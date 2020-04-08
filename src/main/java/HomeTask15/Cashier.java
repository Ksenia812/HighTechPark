package com.HomeTask15;

import java.util.Queue;

public class Cashier extends Thread {
    volatile private Queue<Customer> customerQueue;

    public Cashier(String name, Queue<Customer> customerQueue) {
        super(name);
        this.customerQueue = customerQueue;
        this.setDaemon(true);
        start();
    }

    @Override
    public void run() {
        while (true) {
            try {
                Customer currentCustomer = null;
                synchronized (customerQueue) {
                    while (customerQueue.size() == 0) {
                        customerQueue.wait();
                    }
                    currentCustomer = customerQueue.poll();
                    customerQueue.notifyAll();
                }

                System.out.println(this + " have started to serve " + currentCustomer);
                Thread.sleep(500 * currentCustomer.getSpentTime());
                System.out.println(currentCustomer.getName() + " was served by " + this);

            } catch (InterruptedException e) {
                System.out.println("The cash is unavailable ");
            }
        }
    }

    @Override
    public String toString() {
        return getName();
    }
}
