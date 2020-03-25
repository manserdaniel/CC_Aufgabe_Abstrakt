package com.company;

public class Main {

    public static void main(String[] args) {
	Square quadrat = new Square(10);
	Rectangle rechteck = new Rectangle(10,20);

	quadrat.calculateArea();
	rechteck.calculateArea();
    }
}
