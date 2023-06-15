package com.exepmycompany.main3;
public class Main3 
{
    public static void main(String[] args) 
    {
        Circle c=new Circle();
        c.circle(5.0);
        System.out.println("Area is "+c.calculatearea());
        
        Rectangle r=new Rectangle();
        r.Rec(10,20);
        System.out.println("Area is "+r.calculatearea());
    }
}
