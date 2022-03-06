package com.company.chapter7;

public class DefaultMethodTest {
    public static void main(String[] args){
        ChildIn c = new ChildIn();
        c.method1();
        c.method2();
        MyInterface.staticMethod();
        MyInterface2.staticMethod();
    }
}

class ChildIn extends ParentIn implements MyInterface, MyInterface2{
    //필요한 쪽의 메서드와 같은 내용으로 오버라이드 하면 된다.
    @Override
    public void method1() {
        System.out.println("method1() in Child");
    }
}

class ParentIn{
    public void method2(){
        System.out.println("method2() in Parent");
    }
}

interface MyInterface{
    default void method1(){
        System.out.println("method1() in MyInterface");
    }
    default void method2(){
        System.out.println("method2() in MyInterface");
    }
    static void staticMethod(){
        System.out.println("staticMethod() in MyInterface");
    }
}

interface MyInterface2{
    default void method1(){
        System.out.println("method1() in MyInterface2");
    }
    static void staticMethod(){
        System.out.println("staticMethod() in MyInterface2");
    }
}
