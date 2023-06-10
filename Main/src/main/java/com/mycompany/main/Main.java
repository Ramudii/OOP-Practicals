package com.mycompany.main;
public class Main 
{
    public static void main(String[] args) 
    {
        Politician s1=new Politician();
        s1.speak("Vote me");
        
        Speaker s2=new Priest();
        s2.speak("Bless you");
        
        Speaker s3=new Lecturer();
        s3.speak("Today we are going to learn Jave programming");
                
    }
}
