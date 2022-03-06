package com.company.chapter7;

public class PointTest {
    public static void main(String[] args){
        Point3D p= new Point3D(2, 2, 2);
        System.out.println("좌표: " + p.getLocation());
    }
}
class Point{
    int x, y;
    Point(){ }
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    String getLocation(){
        return "x : " + x + ", y : " + y;
    }
}

class Point3D extends Point{
    int x, y, z;
    Point3D(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    @Override
    String getLocation(){
        return "x : " + x + ", y : " + y + "z : " +z;
    }
}

