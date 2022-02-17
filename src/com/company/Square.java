package com.company;

public class Square {
    int perimeter;
    int area;
    boolean comparison;

    public void processSquareData(int value) {
        this.perimeter = value * 4;
        this.area = value * value;

        if (this.perimeter == this.area) {
            this.comparison = true;
        } else {
            this.comparison = false;
        }

    }

}
