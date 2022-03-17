package com.company.chapter11;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorEx {
    public static void main(String[] args){
        String[] strArr = {"cat", "Dog", "lion", "tiger"};
        Arrays.sort(strArr);
        System.out.println("strArr=" + Arrays.toString(strArr));

        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
        System.out.println("strArr=" + Arrays.toString(strArr));

        Arrays.sort(strArr, new Descending());
        System.out.println("strArr= " + Arrays.toString(strArr));
    }
}

class Descending implements Comparator {

    @Override
    public int compare(Object o1, Object o2) { //compare는 매개변수가 object이기 때문에 반드시 comparable으로 형변환 해야 한다.
        if(o1 instanceof Comparable && o2 instanceof Comparable){
            Comparable c1 = (Comparable) o1;
            Comparable c2 = (Comparable) o2;
            return c1.compareTo(c2) * -1; //-1을 곱해서 기본 정렬방식의 역으로 변경한다.
            //또는 c2.compareTo(c1)처럼 순서를 바꿔도 된다.
        }
        return -1;
    }
}