package com.company;

public class HomeWork3 {

    public static void main(String[] args) {
        byte byteValue = 127;
        short shortValue = 32;
        int intValue = 28;
        long longValue = 13_000;
        char charValue = 'M';
        double doubleValue = 12_000;
        float floatValue = 10_000f;

        System.out.println();
        System.out.println("Задача №1");
        System.out.println("Значение типа Byte = " + byteValue + ";");
        System.out.println("Значение типа short = " + shortValue + ";");
        System.out.println("Значение типа int = " + intValue + ";");
        System.out.println("Значение типа long = " + longValue + ";");
        System.out.println("Значение типа char = " + charValue + ";");
        System.out.println("Значение типа double = " + doubleValue + ";");
        System.out.println("Значение типа float = " + floatValue + ".");

        System.out.println();
        System.out.println("Задача №2");
        show(4);
        show(2);

    }

    public static void show(int val) {
        Square sqr = new Square();
        sqr.processSquareData(val);
        System.out.println("Периметр равен площади:" + sqr.comparison);

    }
}
