package com.exepmycompany.main3;
public class Rectangle extends Shape
{
    private int width,height;
    public void Rec(int width,int height)
    {
        this.width=width;
        this.height=height;
    }
    public double calculatearea()
    {
        return (width*height);
    }
}
