package com.interview.prep.abstractFactory;

public class AzureInstance implements Compute{
    @Override
    public void compute() {
        System.out.println("Hey Compute from Azure");
    }
}
