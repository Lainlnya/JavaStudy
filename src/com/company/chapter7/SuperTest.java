package com.company.chapter7;

public class SuperTest {
    public static void main(String[] args){
        Child c = new Child();
        c.method();
    }
}
class Parent{
    int x = 10;
    void method1(){
        System.out.println("Parent Method");
    }
}

class Child extends Parent{
    int x = 20;
    void method1(){
        System.out.println("Child Method");
    }
    void method(){
        System.out.println("x= " + x);
        System.out.println("this.x= " + this.x);
        System.out.println("super.x= " + super.x);

    }
}
