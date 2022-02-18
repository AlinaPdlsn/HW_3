package com.company;

public class HomeWork3 {

    public static void main(String[] args) {

        exerciseOne();
        exerciceTwo();
    }

    public static void exerciseOne() {
        byte byteValue = 127;
        short shortValue = 32;
        int intValue = 28;
        long longValue = 13_000;
        char charValue = 'M';
        double doubleValue = 12_000;
        float floatValue = 10_000f;

        System.out.println();
        System.out.println("Задача №1");
        System.out.println("Значение типа byte = " + byteValue + ";");
        System.out.println("Значение типа short = " + shortValue + ";");
        System.out.println("Значение типа int = " + intValue + ";");
        System.out.println("Значение типа long = " + longValue + ";");
        System.out.println("Значение типа char = " + charValue + ";");
        System.out.println("Значение типа double = " + doubleValue + ";");
        System.out.println("Значение типа float = " + floatValue + ".");

    }

    public static void exerciceTwo() {
        Square sqr = new Square();
        sqr.size = 4;
        sqr.area = sqr.size * sqr.size;
        sqr.perimetr = sqr.size * 4;
        sqr.compare = sqr.area == sqr.perimetr;

        Square sqr2 = new Square();
        sqr2.size = 2;
        sqr2.area = sqr2.size * sqr2.size;
        sqr2.perimetr = sqr2.size * 4;
        sqr2.compare = sqr2.area == sqr2.perimetr;

        System.out.println();
        System.out.println("Задача №2");
        System.out.println("Периметр равен площади: " + sqr.compare);
        System.out.println("Периметр равен площади: " + sqr2.compare);
    }

}
