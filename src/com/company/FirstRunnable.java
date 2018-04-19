package com.company;

public class FirstRunnable
{
    public static void main(String[] args)
    {

        // lambda expression
        Runnable runnable = () -> {
            System.out.println("I am running at in " + Thread.currentThread().getName());
        };

        // create the thread
        Thread t = new Thread(runnable);
        t.start();
    }
}
