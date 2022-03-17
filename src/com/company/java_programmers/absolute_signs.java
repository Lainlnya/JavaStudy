package com.company.java_programmers;

public class absolute_signs {
    public int absolute_signs(int[] absolutes, boolean[] signs){
        int answers = 0;
        for(int i = 0; i < absolutes.length; ++i){
            answers += (signs[i] ? absolutes[i] : absolutes[i] * -1);
        }
        return answers;
    }
}
