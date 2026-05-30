package com.interview.prep.abstractFactory;

public class AWSStorage implements  Storage{


    @Override
    public void storage() {
        System.out.println("it is storage from AWS");
    }
}
