package com.example.javaproject2.week4.day2;

public class MultiplicationTable {
    private String multipleSymbol;

    public void printDan(int num) {
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d %s %d = %d\n", num, multipleSymbol, i, num * i);
        }
        System.out.println("--------------");
    }

    public MultiplicationTable(String multipleSymbol) {
        this.multipleSymbol = multipleSymbol;
    }

    public static void main(String[] args) {
        MultiplicationTable mt1 = new MultiplicationTable("*");
        // 2, 5 *
        mt1.printDan(2);
        mt1.printDan(5);
        MultiplicationTable mt2 = new MultiplicationTable("x");
        // 7, 8 x
        mt2.printDan(7);
        mt2.printDan(8);
    }
}
