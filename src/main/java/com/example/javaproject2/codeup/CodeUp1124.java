package com.example.javaproject2.codeup;

import java.util.Scanner;

public class CodeUp1124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String molecule = sc.nextLine();

        int hIndex = molecule.indexOf("H");
        int cNum = Integer.parseInt(molecule.substring(1, hIndex));
        int hNum = Integer.parseInt(molecule.substring(hIndex + 1));
        System.out.printf("%d", cNum * 12 + hNum);
    }
}