package com.company.chapter9;

public class StringEx {
    public static void main(String[] args){
        char[] cArr = new char[0];
        String s = new String(cArr);

        System.out.println("cArr.length=" + cArr.length); //0
        System.out.println("@@@" + s + "@@@"); //@@@@@@
    }
}
