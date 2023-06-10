package com.mycompany.main;
public class Politician implements Speaker
{
    @Override
    public void speak(String phrase)
    {
        System.out.println("Polotician "+phrase);
    }
}
