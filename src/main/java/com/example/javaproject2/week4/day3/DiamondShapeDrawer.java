package com.example.javaproject2.week4.day3;

public class DiamondShapeDrawer extends ShapeDrawer2 {

    @Override
    public String makeALine(int h, int i) {
        int pivot1 = h / 2;
        if (i <= pivot1) {
            return String.format("%s%s\n", " ".repeat(h - i - 2), "*".repeat(2 * i - 1));
        } else {
            return String.format("%s%s\n", " ".repeat(i - pivot1 - 1), "*".repeat(2 * (h - i) + 1));
        }
    }

    public static void main(String[] args) {
        DiamondShapeDrawer diamondShapeDrawer = new DiamondShapeDrawer();
        diamondShapeDrawer.printShape(9);
    }
}
