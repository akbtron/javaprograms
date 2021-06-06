package com.akka;

import java.util.ArrayList;
import java.util.List;

public class MultiThreadedBigPrimes {
    public static void main(String[] args) throws InterruptedException {

        Long start = System.currentTimeMillis();

        Results results = new Results();
        Runnable task = new PrimeGenerator(results);
        List<Thread> threads = new ArrayList<>();
        for(int i=0;i<20;i++){
            Thread thread = new Thread(task);
            threads.add(thread);
            thread.start();
        }

        for(Thread t:threads){
            t.join();
        }
        System.out.println(results.getPrimes());
        Long end = System.currentTimeMillis();
        System.out.println("the time taken is : "+(end-start) + " ms.");
    }
}
