package com.example.javaproject2.codeup;

import java.io.*;

public class CodeUp1084 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split(" ");

        int count = 0;
        for(int i=0; i<Integer.parseInt(str[0]); i++){
            for (int j=0; j<Integer.parseInt(str[1]); j++){
                for(int k=0; k< Integer.parseInt(str[2]); k++){
                    bw.write(i+" "+j+" "+k+"\n");
                    count++;
                }
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
    }
}
// 처음 푼 방식. Scanner 를 사용하여 시간초과 발생
// import java.util.Scanner;
//
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int redVal = sc.nextInt();
//         int greenVal = sc.nextInt();
//         int blueVal = sc.nextInt();
//         int count = 0;
//
//         for(int i=0; i<redVal; i++){
//             for(int j=0; j<greenVal; j++){
//                 for(int k=0; k<blueVal; k++){
//                     System.out.printf("%d %d %d\n", i, j, k);
//                     count++;
//                 }
//             }
//         }
//         System.out.println(count);
//     }
// }