package com.company.model;

public class LongWrapper
{
    private Object key = new Object();
    private long l;

    public LongWrapper(long l)
    {
        this.l = l;
    }

    public long getValue()
    {
        return this.l;
    }

    public void incrementValue()
    {
        l = l + 1;
    }

    public void incrementValueSync()
    {
        synchronized (key)
        {
            l = l + 1;
        }

    }
}
