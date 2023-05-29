package week6.day5.generic;

public class Main {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.setItem(10);
        System.out.println(box.getItem());
    }
}
