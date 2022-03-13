package com.company.chapter11;

import java.util.*;

public class PriorityQueue {
    public static void main(String[] args){
        Queue pq = new java.util.PriorityQueue();
        pq.offer(3);
        pq.offer(1);
        pq.offer(5);
        pq.offer(2);
        pq.offer(4);
        System.out.println(pq);

        Object obj = null;

        while((obj = pq.poll()) != null){ //꺼낼 때 우선순위는 1이 가장 높기 때문에 저장한 순서와 상관없이 1부터 꺼내진다.
            System.out.println(obj);
        }

    }
}
