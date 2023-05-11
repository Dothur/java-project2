package com.example.javaproject2.week4.day4.listEx;

import com.example.javaproject2.week4.day1.User;

import java.util.ArrayList;
import java.util.List;

public class ListUser {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        User user1 = new User("김미나", "124215125", "0102252534", 17);
        users.add(user1);

        User user2 = new User("김나나", "125164242","010-1234-1235", 14);
        users.add(user2);

        for (User user : users) {
            System.out.printf("%s님의 전화번호는 %s입니다.\n", user.getName(), user.getPhoneNumber());
        }
    }
}
