package org.tech.concurrency.exam04;

public class LambdaThreadExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println(Thread.currentThread().getName() + ": 스레드 실행 중.."));
        thread.start();
    }
}