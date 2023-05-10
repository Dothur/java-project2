package com.example.javaproject2.week4.day3.interfaceEx;

import java.io.IOException;

public class RightTrianglePrinter {
    private Printer printer;

    // 생성자
    public RightTrianglePrinter(Printer printer) {
        this.printer = printer;
    }
    // 모양 만들기
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", "", "*".repeat(i));
    }

    // 모양 출력하기
    public void printShape(int h) throws IOException {
        String[] lines = new String[h];
        for (int i = 0; i < h; i++) {
            lines[i] = makeALine(h, i + 1);
        }
        printer.print(lines);
    }

    public static void main(String[] args) throws IOException {
        RightTrianglePrinter rtpConsole = new RightTrianglePrinter(new ConsolePrinter());
        rtpConsole.printShape(5);
        RightTrianglePrinter rtpFile = new RightTrianglePrinter(new FilePrinter());
        rtpFile.printShape(5);
    }
}
