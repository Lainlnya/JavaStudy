package com.company.chapter11;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx1 {
    public static void main(String[] args){
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        ListIterator lt = list.listIterator();
        while(lt.hasNext()){
            System.out.println(lt.next());
        }
        System.out.println();

        while(lt.hasPrevious()){
            System.out.println(lt.previous());
        }
        System.out.println();
    }
}
