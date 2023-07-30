package com.mycompany.itemobj;
public class Item 
{
    protected int location;
    protected String description;
    
    public Item(int location,String description)
    {
        this.location=location;
        this.description=description;
    }
    public void display()
    {
        System.out.println("Location "+location);
        System.out.println("Description "+description);
    }
    public void setLocation(int l)
    {
        location=l;
    }
    public int getLocation()
    {
        return location;
    }
    public void setDescription(String d)
    {
        description=d;
    }
    public String getDescription()
    {
        return description;
    }
}
   
    
