package com.mycompany.itemobj;
public class Itemobj 
{
    public static void main(String[] args) 
    {
        Item i1=new Item(123,"Colombo");
        i1.display();
        i1.setLocation(123);
        i1.setDescription("Colombo");
        System.out.println("Location "+i1.getLocation());
        System.out.println("Description "+i1.getDescription());
        Monster m1=new Monster(456,"Homagama");
    }
}
