package ru.oJlagywek;


import java.util.*;

public class Error2 {
    public static void main(String args[]) throws Exception
    {
        Map m = new HashMap();
        m = System.getProperties();
        Random r = new Random();

        while (true) {
            m.put(r.nextInt(), "randomValue");
        }
    }
}
