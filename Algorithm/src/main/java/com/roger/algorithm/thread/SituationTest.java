package com.roger.algorithm.thread;

import java.util.concurrent.CountDownLatch;

/**
 * 场景一：假如APP需要访问两个接口得到数据，在两个接口数据返回时再进行操作下一步。
 */
public class SituationTest {

    static final int count = 2;

    /**
     * CountDownLatch是一个计数器，await()是等待计时器为0后才执行下去，countDown()是使计数器减一。
     */
    static final CountDownLatch countDownLatch = new CountDownLatch(count);

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Main Thread Waiting");
                try {
                    countDownLatch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Both Thread has done!");
            }
        }).start();


        for (int i = 0; i < 2; i++) {

            int finalI = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread - " + finalI + "  running");
                    try {
                        Thread.sleep(2000l);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("Thread - " + finalI + "  Finish!");

                    countDownLatch.countDown();
                }
            }).start();

        }

    }


}
