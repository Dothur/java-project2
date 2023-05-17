package com.example.javaproject2.week5.day3;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack1 {
    // LIFO : Last Input First Out
    private int[] arr = new int[10000];
    private int pointer = 0;

    public void push(int value) {
        this.arr[pointer++] = value;
//        System.out.println(Arrays.toString(arr));
//        System.out.println(pointer);
    }
    public boolean isEmpty(){
        return this.pointer == 0;
    }
    public int pop(){
        if (isEmpty()) throw new EmptyStackException();
        return this.arr[--pointer];
    }
    public int peek(){
        if (isEmpty()) throw new EmptyStackException();
        return this.arr[pointer - 1];
    }

    public static void main(String[] args) {
        Stack1 st1 = new Stack1();
        st1.peek();
    }
}
