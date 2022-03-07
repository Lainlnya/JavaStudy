package com.company.chapter9;

class Person{
    long id;

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Person)
            return id == ((Person) obj).id;
        else
            return false;
    }
    Person(long id){
        this.id = id;
    }
}

public class EqualsEx2 {
    public static void main(String[] args){
        Person p1 = new Person(8011081111222L);
        Person p2 = new Person(8011081111222L);
        //p1과 p2의 주소값이 다르기 때문에 여기서는 다른 사람
        if(p1 == p2){
            System.out.println("p1과 p2는 같은 사람입니다.");
        }else{
            System.out.println("p1과 p2는 다른 사람입니다.");
        }
        //아이디 지정했기 때문에 여기서는 같은 사람
        if(p1.equals(p2))
            System.out.println("p1과 p2는 같은 사람입니다.");
        else{
            System.out.println("p1과 p2는 다른 사람입니다.");
        }
    }
}
