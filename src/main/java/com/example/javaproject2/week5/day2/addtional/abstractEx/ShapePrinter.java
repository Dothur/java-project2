package com.example.javaproject2.week5.day2.addtional.abstractEx;

public abstract class ShapePrinter {
    public abstract String makeALine(int h, int i);
//    {
//        return "*".repeat(i);
//    }
    public void repeat(int h){
        for (int i = 0; i < h; i++) {
            System.out.println(makeALine(h, i));
        }
    }

    public static void main(String[] args) {
//        ShapePrinter rtp = new ShapePrinter();
//        rtp.repeat(5);
    }
}
