package io.codedifferently;

public class Fruit 
{
    private String type;
    private int energy; 
    
    public Fruit(String type, int energy)
    {
        this.type = type;
        this.energy = energy;
    }

    public String gettype()
    {
        return this.type;
    }

    public int getengery()
    {
        return this.energy;
    }
}