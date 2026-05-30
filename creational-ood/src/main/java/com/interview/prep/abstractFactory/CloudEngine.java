package com.interview.prep.abstractFactory;

public class CloudEngine {

    private Compute compute;
    private Storage storage;

    public CloudEngine (CloudResourceFactory cloudResourceFactory)
    {
        this.compute = cloudResourceFactory.compute();
        this.storage = cloudResourceFactory.storage();
    }

    public  void spinUpInfra()
    {
        this.compute.compute();
        this.storage.storage();
    }
}
