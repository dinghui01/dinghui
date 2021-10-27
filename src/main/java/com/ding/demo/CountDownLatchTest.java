package com.ding.demo;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created  by DHui (Tel:7490) on 2021/10/27.
 */
public class CountDownLatchTest {
    public static void main(String[] args) {
        final CountDownLatch latch = new CountDownLatch(2);
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        executorService.execute(()->{
            try {
                Thread.sleep(3000);
                System.out.println("子线程："+Thread.currentThread().getName()+"执行"+System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            latch.countDown();
        });
        executorService.shutdown();
        ExecutorService es2 = Executors.newSingleThreadExecutor();
        es2.execute(()->{
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("子线程："+Thread.currentThread().getName()+"执行"+System.currentTimeMillis());
            latch.countDown();
        });
        es2.shutdown();
        System.out.println("等待两个线程执行完毕…… ……");
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("两个子线程都执行完毕，继续执行主线程");
    }
}
