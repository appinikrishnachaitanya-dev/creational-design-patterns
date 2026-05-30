package com.interview.prep.singletonPattern;

import java.util.concurrent.ConcurrentHashMap;

public enum EnumSingleton {


    INSTANCE;

    private final ConcurrentHashMap<String,Double> concurrentHashMap = new ConcurrentHashMap<>();

    public void Installation()
    {
       this.concurrentHashMap.put("US",0.9);
       this.concurrentHashMap.put("UK",0.8);
    }

    public Double getTaxDetailsBasedOnState(String state)
    {
        return  concurrentHashMap.getOrDefault(state,0.0);
    }

}
