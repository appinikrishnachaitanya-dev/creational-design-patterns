package com.interview.prep.abstractFactory;

public class AzureCloudResourceFactory implements CloudResourceFactory{
    @Override
    public Compute compute() {
        return new AzureInstance();
    }

    @Override
    public Storage storage() {
        return new AzureStorage();
    }
}
