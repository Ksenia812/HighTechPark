package com.HomeTask15;

import java.util.Queue;

public class Cashier extends Thread {
<<<<<<< HEAD
    volatile private Queue<Customer> customerQueue;
=======
    private Queue<Customer> customerQueue;

>>>>>>> feature-lesson15

    public Cashier(String name, Queue<Customer> customerQueue) {
        super(name);
        this.customerQueue = customerQueue;
<<<<<<< HEAD
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
=======

    }


    static void serveCustomer(Cashier cashier, Queue<Customer> customerQueue) {
        while (!customerQueue.isEmpty()) {
            try {
                Customer currentCustomer = null;


                currentCustomer = customerQueue.poll();
                System.out.println(cashier + " have started to serve " + currentCustomer);
                Thread.sleep(500 * currentCustomer.getSpentTime());
                System.out.println(currentCustomer.getName() + " was served by " + cashier);
>>>>>>> feature-lesson15

            } catch (InterruptedException e) {
                System.out.println("The cash is unavailable ");
            }
        }
    }

    @Override
    public String toString() {
        return getName();
    }
<<<<<<< HEAD
=======

    public Queue<Customer> getCustomerQueue() {
        return customerQueue;
    }

    public void setCustomerQueue(Queue<Customer> customerQueue) {
        this.customerQueue = customerQueue;
    }
>>>>>>> feature-lesson15
}
