package com.interview.prep.abstractFactory;

public class AwsInstance implements Compute{

    @Override
    public void compute() {

        System.out.println("Hey Compute from AWS");

    }
}
