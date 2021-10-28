package com.ding.demo.juc.syncUtils;

import java.util.concurrent.Semaphore;

/**
 * Created  by DHui on 2021/10/27.
 */
public class SemaphoreDemo {

    private static Semaphore s1 = new Semaphore(1);
    private static Semaphore s2 = new Semaphore(1);
    private static Semaphore s3 = new Semaphore(1);
    public static void main(String[] args) throws InterruptedException {
        s2.acquire();
        s3.acquire();

        new Thread(()->{
            while (true){
                try {
                    s1.acquire();
                    System.out.println(Thread.currentThread().getName()+":拿到饭票");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                s2.release();
                System.out.println(Thread.currentThread().getName()+":打完饭");

            }
        }).start();

        new Thread(()->{
            while (true){
                try {
                    s2.acquire();
                    System.out.println(Thread.currentThread().getName()+":拿到饭票");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                s3.release();
                System.out.println(Thread.currentThread().getName()+":打完饭");

            }
        }).start();

        new Thread(()->{
            while (true){
                try {
                    s3.acquire();
                    System.out.println(Thread.currentThread().getName()+":拿到饭票");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                s1.release();
                System.out.println(Thread.currentThread().getName()+":打完饭");

            }
        }).start();
    }
}
