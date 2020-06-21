package com.roger.algorithm;

public class TestInner {

    public static void main(String[] args) {

    }

    public void test(final int a) {
        new Thread() {
            public void run() {
                System.out.println(a);
            }

            ;
        }.start();
    }

}
