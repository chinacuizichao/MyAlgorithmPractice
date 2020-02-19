package com.roger.algorithm.thread;

/**
 * 怎么让两个线程依次执行
 */
public class SituationTest2 {

    public static void main(String[] args) {
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("ThreadA start!");
                try {
                    Thread.sleep(2000l);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("ThreadA has done!");
            }
        });

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("ThreadB start!");
                try {
                    threadA.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("ThreadB has done!");
            }
        });

        threadA.start();
        threadB.start();
    }

}
