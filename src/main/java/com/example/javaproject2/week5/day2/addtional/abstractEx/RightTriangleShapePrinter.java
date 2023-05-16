package com.example.javaproject2.week5.day2.addtional.abstractEx;

public class RightTriangleShapePrinter extends ShapePrinter{

    @Override
    public String makeALine(int h, int i) {
        return "*".repeat(i);
    }

    public static void main(String[] args) {
        ShapePrinter rtp = new RightTriangleShapePrinter();
        rtp.repeat(5);
    }
}
