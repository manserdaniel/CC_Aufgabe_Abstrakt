package com.company;

public class Rectangle extends GeometricFigure {
    int a = 0;
    int b = 0;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void calculateArea() {
        System.out.println("Fläche: " + (a*b) + "m²");
    }
}
