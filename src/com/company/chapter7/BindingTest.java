package com.company.chapter7;

public class BindingTest {
    public static void main(String[] args){
        Parent p = new Child();
        Child c = new Child();

        System.out.println("p.x = " + p.x);
        p.method1();
        System.out.println("c.x = " + c.x);
        c.method1();
    }
}

