package com.company.chapter8;

public class ExceptionEx8 {
    public static void main(String[] args){
        System.out.println(1);
        System.out.println(2);
        try{
            System.out.println(3);
            System.out.println(0/0);
        } catch (ArithmeticException ae){
            //예외 전체 출력
            ae.printStackTrace();
            //예외 메시지만 출력
            System.out.println("예외 메시지: "+ ae.getMessage());
        }
        System.out.println(6);
    }
}
