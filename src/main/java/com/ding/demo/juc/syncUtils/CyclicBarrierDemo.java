package com.ding.demo.juc.syncUtils;

import java.util.concurrent.CyclicBarrier;

/**
 * Created  by DHui on 2021/10/27.
 *字面理解“循环栅栏”，可循环的屏障。作用：所有线程都等待完毕继续下一步行动
 *
 */
public class CyclicBarrierDemo {

    static class TaskThread extends Thread{
        private CyclicBarrier barrier;

        public TaskThread(CyclicBarrier barrier){
            this.barrier = barrier;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(1000);
                System.out.println(getName() + " 到达栅栏 A");
                barrier.await();
                System.out.println(getName()+System.currentTimeMillis() + " 冲破栅栏 A");

                Thread.sleep(2000);
                System.out.println(getName() + " 到达栅栏 B");
                barrier.await();
                System.out.println(getName()+System.currentTimeMillis() + " 冲破栅栏 B");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }




    public static void main(String[] args) {
        int threadNum = 5;
        CyclicBarrier cb = new CyclicBarrier(threadNum,()->{
            System.out.println(Thread.currentThread().getName() + " 完成最后任务");
        });

        for (int i=0;i<threadNum;i++){
            new TaskThread(cb).start();
        }
    }

}
