package com.company.chapter9;

//clone()을 쓰려면 반드시 Cloneable을 implements 해야 한다.
class Point implements Cloneable{
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "x=" + x + ", y=" + y;
    }
    public Point clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {} //clone할 때는 반드시 예외처리를 해줘야 한다.
        return (Point) obj;
    }

}
public class CloneEx1 {
    public static void main(String[] args){
        Point original = new Point(3, 5);
        Point copy = original.clone();
        System.out.println(original);
        System.out.println(copy);
    }

}
