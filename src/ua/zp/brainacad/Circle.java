package ua.zp.brainacad;


public class Circle {

public int radius;
public double length;
public double area;
public String color;

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
        this.area = Math.pow(radius, 2) * Math.PI;
        this.length = 2 * Math.PI * radius;

    }
/**
 @author Илья Горипавловский
 @version v1.0
 @return метод возвращает радиус и цвет, также умеет считать площадь и длину окружности
 */





}





//1 Создание класса с конструктором
//        1.1 Создать класс Circle. Описать поля: радиус длинна окружности, площадь, цвет.
//        Создать 2 конструктора, в которые передавать параметры: радиус, и цвет и радиус.
//        1.2 Параметры площадь и длинна окружности расcчитать в конструкторе на основе
//        радиуса и Pi. Примечание число PI можно взять из класса Math, Math.PI.
//        1.3 Создать метод main, в котором создать экземпляр класса Circle. Вывести на экран
//        сообщение с данными о длинне окружности, площади и цвета.

