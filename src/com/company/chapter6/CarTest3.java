package com.company.chapter6;

class Car{
    String color;
    String gearType;
    int door;
    Car(){
        this("white", "auto", 4);
    }
    Car(Car c){
        color = c.color;
        gearType = c.gearType;
        door = c.door;
    }
    Car(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
public class CarTest3 {
    public static void main(String[] args){
        Car c1 = new Car();
        Car c2 = new Car(c1);
        System.out.println("C1의 color = " + c1.color + "gearType = " + c1.gearType + "door = " + c1.door);
        System.out.println("C2의 color = " + c2.color + "gearType = " + c2.gearType + "door = " + c2.door);

        c1.door = 100;
        System.out.println("c1 100 이후");
        System.out.println("C1의 color = " + c1.color + "gearType = " + c1.gearType + "door = " + c1.door);
        //c1을 참조하여 만들어진 c2이기는 하지만, 독립적으로 메모리에 존재하는 인스턴스이기 때문에 c1의 값이 변경되어도 영향을 받지 않는다.
        System.out.println("C2의 color = " + c2.color + "gearType = " + c2.gearType + "door = " + c2.door);
    }
}
