package com.example.javaproject2.week4.day2;

public class DiExTest {
    public static void main(String[] args) {
        PyramidShapeDrawer pyramidShapeDrawer = new PyramidShapeDrawer();
        DiEx diEx = new DiEx(pyramidShapeDrawer);
        diEx.doSth();
        ParallelogramShapeDrawer parallelogramShapeDrawer = new ParallelogramShapeDrawer();
        DiEx diEx2 = new DiEx(parallelogramShapeDrawer);
        diEx2.doSth();
    }
}
