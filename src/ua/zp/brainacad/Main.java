package ua.zp.brainacad;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Circle circle = new Circle(4, "Green");
        System.out.println("Площадь = " + circle.area);
        System.out.println("Длина = " + circle.length);
        System.out.println("Цвет = " + circle.color);
    }
}
