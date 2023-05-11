package com.example.javaproject2.week4.day1;

class UserTest {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setName("김미미");
        user1.setAge(17);
        user1.setPassword("12341234");
        user1.setPhoneNumber("01012341234");

        User user2 = new User();
        user2.setName("김나나");
        user2.setAge(30);
        user2.setPassword("321321");
        user2.setPhoneNumber("010321321");

        System.out.printf("%s 는 어른인가요? : %b\n", user1.getName(), user1.isAdult());
        System.out.printf("%s 의 비밀번호는 %s 폰넘버는 %s 입니다 \n", user1.getName(), user1.getPassword(), user1.getPhoneNumber());
        System.out.printf("%s 는 어른인가요? : %b\n", user2.getName(), user2.isAdult());
        System.out.printf("%s 의 비밀번호는 %s 폰넘버는 %s 입니다 \n", user2.getName(), user2.getPassword(), user2.getPhoneNumber());
    }
}