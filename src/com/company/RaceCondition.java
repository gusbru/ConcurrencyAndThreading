package com.company;

import com.company.model.LongWrapper;

public class RaceCondition
{
    public static void main(String[] args) throws InterruptedException
    {
        LongWrapper l = new LongWrapper(0L);

        Runnable r = () -> {
            for (int i = 0; i < 1_000; i++)
            {
//                l.incrementValue();
                l.incrementValueSync();
            }

        };

        // create 1000 threads to run the runnable
        Thread[] threads = new Thread[1_000];
        for (int i = 0; i < 1_000; i++)
        {
            threads[i] = new Thread(r);
            threads[i].start();
        }

        // the code executed after this is executed only after the
        // execution of all the threads
        for (int i = 0; i < 1_000; i++)
        {
            threads[i].join();
        }


        System.out.println("Value = " + l.getValue());

    }
}
