package week6.day5.interfaceEx2;

public class Circle implements Shape{
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return radius * radius * 3.14;
    }
}
