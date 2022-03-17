package com.company.chapter11;

import java.util.Iterator;

public class MyVector2 extends MyVector implements Iterator {
    int cursor = 0;
    int lastRet = -1;

    public MyVector2(int capacity){
        super(capacity);
    }

    public MyVector2(){
        this(10);
    }

    public String toString(){
        String tmp = "";
        Iterator it = iterator();

        for(int i = 0; it.hasNext(); ++i){
            if(i != 0) tmp += ", ";
            tmp += it.next();
        }
        return "[" + tmp + "]";
    }

    public Iterator iterator(){
        cursor = 0;
        lastRet = -1;
        return this;
    }

    public boolean hasNext(){
        return cursor != size();
    }

    public Object next(){
        Object next = get(cursor);
        //선증가가 아닌 후 증가이기 때문에 lastRet이 원래의 cursor 값을 가지게 되고, cursor는 이후 값이 1만큼 증가하게 된다.
        lastRet = cursor++;
        return next;
    }

    public void remove(){
        if(lastRet == -1)
            throw new IllegalStateException();
        else
            remove(lastRet);
            cursor--;
            lastRet = -1;
    }

}
