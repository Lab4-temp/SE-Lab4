package com.example.lab4;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(int x, int y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }
    @Override
    public double area() {
        return width * height;
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
}
