package ru.oJlagywek;

import java.util.ArrayList;
import java.util.List;


public class OutOfMemory {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>() ;
        while(true) {
            list.add ("test");
        }
    }
}