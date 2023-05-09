package com.example.javaproject2.week4.day2;

public class PyramidClass {
    private final int height;
    private final String spaceChar;
    private final String star;

    private PyramidClass(int height, String spaceChar, String star) {
        this.spaceChar = spaceChar;
        this.height = height;
        this.star = star;
    }

    private void printPyramid() {
        for (int i = 0; i < height; i++) {
            System.out.print(makePyramidLine(height, i));
        }
    }

    private void printParallelogram() {
        for (int i = 0; i < getHeight(); i++) {
            System.out.print(makeParallelogramALine(getHeight(), i));
        }
    }

    public int getHeight() {
        return height;
    }

    private String makePyramidLine(int height, int i) {
        return String.format("%s%s\n", spaceChar.repeat(i), star.repeat(height * 2 - 1 - i * 2));
    }

    private String makeParallelogramALine(int height, int i) {
        return String.format("%s%s\n", spaceChar.repeat(i), star.repeat(height));
    }

    public static void main(String[] args) {
        PyramidClass pyramidclass = new PyramidClass(5, " ", "#");
        pyramidclass.printPyramid();
        pyramidclass.printParallelogram();
        System.out.println(pyramidclass.getHeight());
    }
}