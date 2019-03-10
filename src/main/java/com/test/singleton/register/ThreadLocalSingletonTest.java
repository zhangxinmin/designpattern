package com.test.singleton.register;



public class ThreadLocalSingletonTest extends  Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getId()+"==="+ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getId()+"==="+ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getId()+"==="+ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getId()+"==="+ThreadLocalSingleton.getInstance());
    }

    public static void main(String[] args){
        System.out.println(Thread.currentThread().getId()+"==="+ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getId()+"==="+ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getId()+"==="+ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread().getId()+"==="+ThreadLocalSingleton.getInstance());
        Thread t1 = new  Thread(new ThreadLocalSingletonTest());
        Thread t2 = new  Thread(new ThreadLocalSingletonTest());
        t1.start();
        t2.start();
    }
}
