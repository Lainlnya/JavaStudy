package com.company.chapter6;

public class MemberCall {
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
//    static은 인스턴스 변수를 참조할 수 없다.
//    static int cv2 = iv;
    static void staticMethod1(){
        System.out.println(cv);
//        위와 동일한 이유
//        System.out.println(iv);
    MemberCall mc = new MemberCall();
    System.out.println(mc.iv);
    }
    void instanceMethod1(){
        System.out.println(cv);
        System.out.println(iv); //인스턴스메서드에서는 인스턴스 변수 사용가능
    }

    static void staticMethod2(){
        staticMethod1();
//        instanceMethod1();
        MemberCall c = new MemberCall();
        c.instanceMethod1();
    }
    void instanceMethod2(){
        staticMethod1();
        instanceMethod1();
    }
}

