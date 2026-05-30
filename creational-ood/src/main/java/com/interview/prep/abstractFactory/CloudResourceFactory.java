package com.interview.prep.abstractFactory;

public interface CloudResourceFactory {

    Compute compute();

    Storage storage();
}
