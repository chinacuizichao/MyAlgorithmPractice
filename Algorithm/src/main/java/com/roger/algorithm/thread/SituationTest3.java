package com.roger.algorithm.thread;

/**
 * 场景：小明打了老王一巴掌，老王打回他，小明又打老王一巴掌，循环如此
 */
public class SituationTest3 {
    static Object object = new Object();

    public static void main(String[] args) {
        final Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (i < 5) {
                    synchronized (object) {
                        try {
                            System.out.println("小明打了老王一巴掌");
                            object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        i++;
                    }
                }
            }
        });
        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    int i = 0;
                    while (i < 5) {
                        synchronized (object) {
                            System.out.println("老王打了小明一巴掌");
                            object.notify();
                            i++;
                        }
                        Thread.sleep(1500);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        threadA.start();
        threadB.start();
    }
}
