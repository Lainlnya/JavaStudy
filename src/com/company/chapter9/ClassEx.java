package com.company.chapter9;

import java.lang.reflect.InvocationTargetException;

final class Card{
    String kind;
    int num;
    Card(){
        this("SPADE", 1);
    }

    public Card(String kind, int num) {
        this.kind = kind;
        this.num = num;
    }
    public String toString(){
        return kind + ":" + num;
    }
}

public class ClassEx {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Card c = new Card("HEART", 3);
        Card c2 = Card.class.newInstance();
        Class obj = c.getClass();

        System.out.println(c);
        System.out.println(c2);
        System.out.println(obj.getName()); // package와 class 이름을 함께 알려줌, com.company.chapter9.Card
        System.out.println(obj.toGenericString()); // class의 형까지 함께 알려줌, final class com.company.chapter9.Card
        System.out.println(obj.toString()); // class com.company.chapter9.Card
    }
}
