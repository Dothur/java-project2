package com.example.javaproject2.week5.day2.addtional.abstractEx;

public class PyramidShapePrinter extends ShapePrinter {
    @Override
    public String makeALine(int h, int i) {
        return String.format("%s%s", " ".repeat(h - i - 1), "*".repeat(2 * i + 1));
    }

    public static void main(String[] args) {
        ShapePrinter sp = new PyramidShapePrinter();
        sp.repeat(5);
    }
}
