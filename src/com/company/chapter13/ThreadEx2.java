package com.company.chapter13;

public class ThreadEx2 {
    public static void main(String[] args){
        ThreadEx2_1 t1 = new ThreadEx2_1();
        //t1.run(); //메인쓰레드의 호출 스택을 불러옴, 새로운 thread를 생성하지 않음
        t1.start(); //새로운 thread를 생성, 다른 thread의 실행에는 영향을 미치지 않음
    }

}
class ThreadEx2_1 extends Thread{
    @Override
    public void run() {
        throwException();
    }
    public void throwException(){
        try{
            throw new Exception();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}