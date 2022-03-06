package com.company.chapter7;

public class FinalCardTest {
    public static void main(String[] args){
        Card2 c = new Card2(5, "HEART"); //이때 딱 한 번만 초기화 할 수 있다.
        //c.NUMBER = 5; 는 안된다.
        System.out.println(c.NUMBER);
        System.out.println(c.KIND);
        System.out.println(c);
    }
}

class Card2{
    final int NUMBER;
    final String KIND;
    static int width = 100;
    static int height = 250;
    Card2(int number, String kind){
        this.NUMBER = number;
        this.KIND = kind;
    }

    Card2(){
        this(1, "HEART");
    }

    public String toString(){
        return KIND + " " + NUMBER;
    }
}
