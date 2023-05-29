package week6.day5.abstractEx;


public class Cat extends Animal{

    @Override
    public void makeSound() {
        System.out.println("냐옹");
    }

    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.eat();
        cat.makeSound();
    }
}
