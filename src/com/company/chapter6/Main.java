package com.company.chapter6;

public class Main {

    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long result = mm.add(5L, 3L);
        System.out.println("add는 " + result);
    }
}
class MyMath
{
    long add(long a, long b)
    {
        long result = a + b;
        return result;
    }
    long substract(long a, long b) { return a - b;}
    //        long add(long a, long b)
//        {
//            long test = substract();
//            long result = a + test;
//            return result;
//        }
//        long substract(){return 5;}
    long multiply(long a, long b) {return a * b;}
    double divide(double a, double b){ return a / b;}
}
