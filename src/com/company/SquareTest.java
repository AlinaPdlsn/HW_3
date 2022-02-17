package com.company;

public class SquareTest {

    public void main(String[] args) {
        Square sqr = new Square();
        sqr.processSquareData(4);
        System.out.println("Периметр равен площади:" + sqr.comparison);
        sqr.processSquareData(2);
        System.out.println("Периметр равен площади:" + sqr.comparison);

    }
}
