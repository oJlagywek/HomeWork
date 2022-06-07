package ru.oJlagywek;

import java.util.*;

public class Error4 {
    static javassist.ClassPool cp
            = javassist.ClassPool.getDefault();

    public static void main(String args[]) throws Exception
    {
        for (int i = 0; i < 100000; i++) {
            Class c = cp.makeClass(
                            "com.saket.demo.Metaspace" + i)
                    .toClass();
        }
    }
}