package com.chaos.quasar.demo;

import co.paralleluniverse.fibers.Fiber;
import co.paralleluniverse.strands.SuspendableRunnable;

/**
 * Created by zcfrank1st on 17/02/2017.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        new Fiber<Void>((SuspendableRunnable) () -> System.out.println("hello world")).start();

        while (true) {
            Thread.sleep(5000L);
            System.out.println("============");
        }
    }
}
