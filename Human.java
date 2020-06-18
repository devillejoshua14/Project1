package io.codedifferently;

public class Human 
{
    
    private String fist_name;
    private String last_name; 
    static int max_ennergy = 100;
    private int energy;
    
    public Human (String first_name, String last_name)
    {
        this.fist_name = first_name;
        this.last_name = last_name;
        this.energy = 50;
    }
    
    public void eat(Fruit fruit)
    {
        if (this.energy + fruit.getengery() <= max_ennergy)
        {
            this.energy = this.energy + fruit.getengery();
        }
        else
        {
            this.energy = max_ennergy;
            System.out.println("We are full of energy");
        }
    }

    public void work(int hours)
    {
        int energy_spent = hours * 10;

        if (this.energy - energy_spent < 0)
        {
            System.out.println("Couldn't do the work, Energy too low.  Try to eat something and getthis work done later");
        }
        else 
        {
            this.energy = this.energy - energy_spent;
        }

    }
    public int getenergy() 
    {
        return this.energy;
    }

    public String getfirst_name()
    {
        return this.fist_name;
    }

    public String getlast_name()
    {
        return this.last_name;
    }
}