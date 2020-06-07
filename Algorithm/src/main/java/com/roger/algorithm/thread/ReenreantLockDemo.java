package com.roger.algorithm.thread;

import java.util.concurrent.locks.ReentrantLock;

public class ReenreantLockDemo {

    private static ReentrantLock sLock = new ReentrantLock();

    public static void main(String[] args) {

        // block until condition holds
        sLock.lock();

        try {

            System.out.println("Test");
        } finally {

            sLock.unlock();
        }


    }
}
