package com.company.chapter8;

public class ExceptionEx17 {
    public static void main(String[] args){
        try{
            method1();
        }catch (Exception e){
            System.out.println("main 메서드에서 예외가 처리되었습니다.");
        }
    }
    static int method1() throws Exception{
        try{
            System.out.println("method1이 호출되었습니다.");
            return 0;
        } catch (Exception e){
            System.out.println("method1에서 예외가 처리되었습니다. ");
            return 1;
        }finally {
            System.out.println("method1의 finally블럭이 실행되었습니다. ");
        }
    }
}
