package com.interview.prep.singletonPattern;

public class DoubleLockingSingleton {

//    private static    DoubleLockingSingleton doubleLockingSingleton;

    private static volatile DoubleLockingSingleton doubleLockingSingleton;

    private DoubleLockingSingleton()
    {

    }

//    private static  synchronized  DoubleLockingSingleton getInstance()
//    {
//        if(doubleLockingSingleton==null)
//        {
//            doubleLockingSingleton = new DoubleLockingSingleton();
//        }
//
//        return  doubleLockingSingleton;
//    }

     public static  DoubleLockingSingleton getInstance()
     {
         if(doubleLockingSingleton == null)
         {
             synchronized (DoubleLockingSingleton.class)
             {
                 if(doubleLockingSingleton==null)
                 {
                     doubleLockingSingleton = new DoubleLockingSingleton();
                 }
             }
         }

         return  doubleLockingSingleton;
     }
}
