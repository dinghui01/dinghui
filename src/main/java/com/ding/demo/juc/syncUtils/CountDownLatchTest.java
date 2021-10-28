package com.ding.demo.juc.syncUtils;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created  by DHui on 2021/10/27.
 * 多线个线程执行
 * 一个线程等待其他线程各自执行完毕后再执行
 * 通过计数器来实现
 */
public class CountDownLatchTest {
    public static void main(String[] args) {
        final CountDownLatch latch = new CountDownLatch(2);
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        executorService.execute(()->{
            /*try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            System.out.println("子线程："+Thread.currentThread().getName()+"执行"+System.currentTimeMillis());
            latch.countDown();
        });
        executorService.shutdown();
        ExecutorService es2 = Executors.newSingleThreadExecutor();
        es2.execute(()->{
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
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
