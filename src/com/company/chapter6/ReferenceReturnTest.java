package com.company.chapter6;

class Data { int x;}

public class ReferenceReturnTest {
    public static void main(String[] args){
        Data d = new Data();
        d.x = 10;

        Data d2 = copy(d);
        System.out.println("d.x = " + d.x);
        System.out.println("d2.x = " + d2.x);
    }
    //즉, 여기서 반환형 타입이 Data가 되는 것!!
    static Data copy(Data d){
        Data tmp = new Data();
        tmp.x = d.x;

        return tmp;
    }
}
