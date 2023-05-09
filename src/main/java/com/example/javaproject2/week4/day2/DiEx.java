package com.example.javaproject2.week4.day2;

public class DiEx {
    private ShapeDrawer shapeDrawer; // 참조변수 ( ShapeDrawer )
    public DiEx(ShapeDrawer shapeDrawer){ // 생성자 (param = 객체)
        this.shapeDrawer = shapeDrawer;
    }
    public void doSth(){
        shapeDrawer.printShape(5);
    }
}
