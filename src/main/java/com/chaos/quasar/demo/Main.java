package com.chaos.quasar.demo;

import co.paralleluniverse.fibers.*;
import co.paralleluniverse.strands.SuspendableRunnable;

import java.util.concurrent.Executors;

/**
 * Created by zcfrank1st on 17/02/2017.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        new Fiber<Void>((SuspendableRunnable) () -> System.out.println("hello world")).start();

        FiberExecutorScheduler scheduler = new FiberExecutorScheduler("", Executors.newSingleThreadExecutor());

        FiberForkJoinScheduler forkJoinScheduler = new FiberForkJoinScheduler("", 12);

        FiberTimedScheduler timedScheduler = new FiberTimedScheduler(scheduler);
    }
}
