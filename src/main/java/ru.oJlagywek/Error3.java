package ru.oJlagywek;

import javassist.ClassPool;

public class Error3 {
    static ClassPool classPool = ClassPool.getDefault();

    public static void main(String args[]) throws Exception
    {
        for (int i = 0; i < 1000000000; i++) {
            Class c = classPool.makeClass("com.saket.demo.Permgen" + i).toClass();
            System.out.println(c.getName());
        }
    }
}