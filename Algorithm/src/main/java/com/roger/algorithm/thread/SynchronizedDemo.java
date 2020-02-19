package com.roger.algorithm.thread;

public class SynchronizedDemo {

    public Object mLock = new Object();

    public static void main(String[] args) {

        SynchronizedDemo demo = new SynchronizedDemo();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 900; i++) {
                    demo.ObjectLockMethod1();
                }
            }
        };

        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 900; i++) {
                    demo.ObjectLockMethod2();
                }
            }
        };

        Runnable runnable3 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 900; i++) {
                    demo.ObjectLockMethod3();
                }
            }
        };

        runnable.run();
        runnable2.run();
        runnable3.run();
    }

    public synchronized void ObjectLockMethod1() {
        System.out.println("对象锁111");
    }

    public void ObjectLockMethod2 () {
        synchronized (this) {
            System.out.println("对象锁222");
        }
    }

    public void ObjectLockMethod3() {
        synchronized (mLock) {
            System.out.println("对象锁333");
        }
    }

}
