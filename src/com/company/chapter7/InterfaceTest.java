package com.company.chapter7;

class A {
    void methodA(){
        I i = InstanceManager.getInstance();
        i.methodB();
        System.out.println(i.toString());
    }
}

interface I{
    public abstract void methodB();
}

class B implements I{
    @Override
    public void methodB() {
        System.out.println("Play in class B");
    }
    public String toString(){
        return "class B";
    }
}

class InstanceManager{
    public static I getInstance(){
        return new B(); //다른 인스턴스로 바꾸려면 여기만 변경하면 된다.
    }
}

public class InterfaceTest {
    public static void main(String[] args){
        A a = new A();
        a.methodA();
    }

}
