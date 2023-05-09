package com.example.javaproject2.week4.day2;

public class ReversePyramid {
    private final int height;
    private final String spaceChar;
    private final String star;
    private ReversePyramid(int height, String spaceChar, String star) {
        this.spaceChar = spaceChar;
        this.height = height;
        this.star = star;
    }
    private void printPyramid(){
        for (int i = 0; i < height; i++) {
            System.out.print(makePyramidLine(height, i));
        }
    }
    private void printParallelogram(){
        for (int i = 0; i < getHeight(); i++) {
            System.out.print(makeParallelogramALine(getHeight(), i));
        }
    }
    private int getHeight(){
        return height;
    }

    private String makePyramidLine(int height, int i){
       return String.format("%s%s\n", spaceChar.repeat(i), star.repeat(height * 2 - 1 - i * 2));
    }
    private String makeParallelogramALine(int height, int i) {
        return String.format("%s%s\n", spaceChar.repeat(i), star.repeat(height));
    }
    public static void main(String[] args) {
        ReversePyramid reversePyramid = new ReversePyramid(5, " ", "#");
        reversePyramid.printPyramid();
        reversePyramid.printParallelogram();
    }
}