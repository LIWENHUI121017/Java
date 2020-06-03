package com.day07;

import javax.swing.*;
import java.awt.*;

public class TestCurrentThread {
    public static void main(String[] args) {
        System.out.println("运行main方法的线程是：" + Thread.currentThread());
        Thread t = new Thread() {
            @Override
            public void run() {
                System.out.println("线程t：" + Thread.currentThread());
                testCurrent();
            }
        };
        t.start();
    }

    /**
     * 测试不同线程调用该方法时，获取这个线程
     */
    public static void testCurrent() {
        System.out.println("运行testCurrnent方法的线程是：" + Thread.currentThread());
    }
}