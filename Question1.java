package com.company;

import java.util.Date;

class Geometric
{
    private final String color;
    private final Boolean transparency;

    Geometric()
    {
        this.color = "white";
        this.transparency = true;
    }

    Geometric(String color, Boolean transparency)
    {
        this.color = color;
        this.transparency = transparency;
    }

    public String getColor()
    {
        return this.color;
    }

    public Boolean getTransparency()
    {
        return this.transparency;
    }

    public Date getDate()
    {
        Date date = new Date();

        return date;
    }

    public String getInformation()
    {
        return "created on " + this.getDate() + " with the color of " + this.color + " and transparency is " + this.transparency;
    }
}

class Circle extends Geometric
{
    private static final double PI = 3.14159;
    double radius = 0.0;

    Circle(double radius)
    {
        this.radius = radius;
    }

    Circle(String color, Boolean transparency, double radius)
    {
        super(color, transparency);
        this.radius = radius;
    }

    public double getDiameter()
    {
        return this.radius * 2;
    }

    public double getArea()
    {
        return Math.pow(this.radius, 2) * PI;
    }
}

class Rectangle extends Geometric
{
    double length = 0.0, breadth = 0.0;

    Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    Rectangle(String color, Boolean transparency, double length, double breadth)
    {
        super(color, transparency);
        this.length = length;
        this.breadth = breadth;
    }

    public double getPerimeter()
    {
        return (this.length * 2) + (this.breadth * 2);
    }

    public double getArea()
    {
        return this.length * this.breadth;
    }
}

public class Question1
{
    public static void main(String[] args)
    {
        Circle circle = new Circle("Blue", false, 1.5);

        System.out.println("A circle " + circle.getInformation());
        System.out.println("Color: " + circle.getColor());
        System.out.println("Diameter: " + circle.getDiameter());
        System.out.println("Area of the circle with a radius of " + circle.radius + ": " + String.format("%.2f", circle.getArea()));

        Rectangle rectangle = new Rectangle(2, 4);

        System.out.println("\nA rectangle " + rectangle.getInformation());
        System.out.println("Color: " + rectangle.getColor());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Area of the rectangle with a length of " + rectangle.length + " and a breadth of " + rectangle.breadth + ": " + String.format("%.2f", rectangle.getArea()));
    }
}