package com.company.java_programmers;

public class addNumbers {
    public static void main(String[] args){
        solution(new int[] {4, 5, 1, 2});
    }
    public static int solution(int[] numbers){
        int answer = 0;
        int arrayEx[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for(int j = 0; j < numbers.length; ++j){
            for(int i = 0; i < arrayEx.length; ++i){
                if(numbers[j] != i) continue;
                else
                    arrayEx[i] = 0;

            }
        }
        for( int i = 0; i < arrayEx.length; ++i)
            answer += arrayEx[i];

        return answer;
    }
}
