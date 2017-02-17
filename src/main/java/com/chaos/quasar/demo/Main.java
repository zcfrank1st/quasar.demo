package com.chaos.quasar.demo;

import co.paralleluniverse.fibers.Fiber;
import co.paralleluniverse.fibers.FiberExecutorScheduler;
import co.paralleluniverse.fibers.FiberForkJoinScheduler;
import co.paralleluniverse.fibers.FiberTimedScheduler;
import co.paralleluniverse.strands.SuspendableRunnable;

import java.util.concurrent.Executors;

/**
 * Created by zcfrank1st on 17/02/2017.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        new Fiber<Void>((SuspendableRunnable) () -> System.out.println("hello world")).start();

        FiberExecutorScheduler scheduler = new FiberExecutorScheduler("", Executors.newSingleThreadExecutor());
        scheduler.execute(() -> System.out.println(""));


        FiberForkJoinScheduler forkJoinScheduler = new FiberForkJoinScheduler("", 12);

        FiberTimedScheduler timedScheduler = new FiberTimedScheduler(scheduler);


    }
}
