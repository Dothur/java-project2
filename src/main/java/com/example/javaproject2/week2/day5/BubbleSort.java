package com.example.javaproject2.week2.day5;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        int[] bubbleArray = new int[arrayLength];
        for(int i=0; i<arrayLength; i++){
            bubbleArray[i] = sc.nextInt();
        }
        for(int i=0; i<arrayLength; i++){
            for(int j=0; j<arrayLength; j++){
                if(bubbleArray[i] < bubbleArray[j]){
                    int temp = bubbleArray[i];
                    bubbleArray[i] = bubbleArray[j];
                    bubbleArray[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(bubbleArray));
    }
}
