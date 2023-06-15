package com.exepmycompany.main3;
public class Circle extends Shape
{
    private double radius;
    public void circle(double radius)
    {
        this.radius=radius;
    }
    public double calculatearea()
    {
        return 2*Math.PI*radius;
    }
}
