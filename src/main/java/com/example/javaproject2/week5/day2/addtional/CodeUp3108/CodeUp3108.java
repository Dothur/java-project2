package com.example.javaproject2.week5.day2.addtional.CodeUp3108;

import java.util.ArrayList;
import java.util.List;

public class CodeUp3108 {
    private List<Student> students = new ArrayList<>();

    public Student parse(String str) {
        String[] split = str.split(" ");
        return new Student(split[0], Integer.parseInt(split[1]), split[2]);
    }

    public void process(String str) {
        Student student = parse(str);
        if ("I".equals(student.getCode())) {
            addAStudent(student);
        } else {
            deleteAStudent(student);
        }
    }
    private boolean isDuplicated(Student pStudent){
        for (Student student : students) {
            if (student.getTestId() == pStudent.getTestId()){
                return false;
            }
        }
        return true;
    }

    private void addAStudent(Student pStudent) {
        if (isDuplicated(pStudent)){
            students.add(pStudent);
            System.out.println("--add--");
        }
    }

    private void deleteAStudent(Student student) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getTestId() == student.getTestId()){
                students.remove(i);
                System.out.println("--delete--");
            }
        }
    }


    public static void main(String[] args) {
        CodeUp3108 codeUp3108 = new CodeUp3108();
        codeUp3108.process("I 1011 한라산");
        codeUp3108.process("I 999 백두산");
        codeUp3108.process("I 999 오대산");
        codeUp3108.process("D 999 백두산");
        codeUp3108.process("I 800 백두산");
        codeUp3108.process("D 500 한라산");
        codeUp3108.process("I 900 남산");
        codeUp3108.process("I 950 금강산");
        codeUp3108.process("I 1205 지리산");
        codeUp3108.process("I 700 북한산");
    }
}
