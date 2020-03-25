package com.company;

public class Square extends GeometricFigure{

    int a = 0;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public void calculateArea() {
        System.out.println("Fläche: " + (a*a) + "m²");
    }
}
