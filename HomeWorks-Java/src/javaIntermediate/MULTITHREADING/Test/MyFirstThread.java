package javaIntermediate.MULTITHREADING.Test;

public class MyFirstThread {
    public static void main(String[] args) {
        TestThread task = new TestThread();
        new Thread(task).start();
    }
}

class TestThread implements Runnable{
    @Override
    public void run() {
        System.out.println("My first thread");
    }
}