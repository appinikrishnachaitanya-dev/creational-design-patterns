package com.interview.prep.singletonPattern;

public class BillPughSingleton {

    private static  BillPughSingleton billPughSingleton;


    private BillPughSingleton()
    {

    }

    static public class BillPlugSingletonInnerClass
    {
        public static BillPughSingleton getInstance()
        {
            if(billPughSingleton==null)
            {
                billPughSingleton = new BillPughSingleton();
            }

            return  billPughSingleton;
        }
    }
}
