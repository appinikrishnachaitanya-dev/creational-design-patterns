package com.interview.prep.abstractFactory;

public class AWSCloudResourceFactory implements CloudResourceFactory{

    @Override
    public Compute compute() {
      return   new AwsInstance();
    }

    @Override
    public Storage storage() {
        return new AWSStorage();
    }
}
