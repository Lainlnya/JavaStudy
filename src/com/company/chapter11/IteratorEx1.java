package com.company.chapter11;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx1 {
    public static void main(String[] args){
        ArrayList al = new ArrayList();
        al.add("1");
        al.add("2");
        al.add("3");
        al.add("4");
        al.add("5");

        Iterator it = al.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }

    }
}
