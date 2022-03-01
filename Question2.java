package com.company;
abstract class Shape
{
    private static final double PI = 3.14159;
    double first_dimension = 0.0, second_dimension = 0.0;

    Shape(double first_dimension, double second_dimension)
    {
        this.first_dimension = first_dimension;
        this.second_dimension = second_dimension;
    }

    public double getFirst_dimension()
    {
        return this.first_dimension;
    }

    public double getSecond_dimension() {
        return second_dimension;
    }

    public double getPI()
    {
        return this.PI;
    }

    public abstract double getArea();
}

class Rectangle_ extends Shape
{
    Rectangle_(double length, double width)
    {
        super(length, width);
    }

    public double getArea()
    {
        return getFirst_dimension() * getSecond_dimension();
    }
}

class Triangle extends Shape
{
    Triangle(double height, double base)
    {
        super(height, base);
    }

    public double getArea()
    {
        return 0.5 * getFirst_dimension() * getSecond_dimension();
    }
}

class Circle_ extends Shape
{
    Circle_(double radius)
    {
        super(radius, radius);
    }

    public double getArea()
    {
        return Math.pow(getFirst_dimension(), 2) * getPI();
    }
}

class Ellipse extends Shape
{
    Ellipse(double first_dimension, double second_dimension)
    {
        super(first_dimension, second_dimension);
    }

    public double getArea()
    {
        return getPI() * getFirst_dimension() * getSecond_dimension();
    }
}

class Square extends Shape
{
    Square(double length, double breadth)
    {
        super(length, breadth);
    }

    public double getArea()
    {
        return getFirst_dimension() * getSecond_dimension();
    }
}

public class Question2
{
    public static void main(String[] args)
    {
        Rectangle_ rectangle = new Rectangle_(9, 5);
        Triangle triangle = new Triangle(10,8);
        Circle_ circle = new Circle_(5);
        Ellipse ellipse = new Ellipse(7, 7);
        Square square = new Square(6, 6);

        System.out.println("Area of a rectangle: " + String.format("%.2f", rectangle.getArea()));
        System.out.println("Area of a triangle: " + String.format("%.2f", triangle.getArea()));
        System.out.println("Area of a circle: " + String.format("%.2f", circle.getArea()));
        System.out.println("Area of an ellipse: " + String.format("%.2f", ellipse.getArea()));
        System.out.println("Area of a square: " + String.format("%.2f", square.getArea()));
    }
}
