package com.firstthreadexample;

class MyThread extends Thread {
    public void run(){
       for(int i=1;i<=10;i++)
       {
           System.out.println(i);
       }
    }
}

public class Thread1 {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        thread1.start();
        thread2.start();
    }
}
