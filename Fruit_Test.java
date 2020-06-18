package io.codedifferently;

import org.junit.Test;

import org.junit.Assert;

public class Fruit_Test 
{
    @Test
    public void constructor_test()
    {
        // Given 
        String type = "tomato";
        int energy = 20;

        // When 
        Fruit test_fruit = new Fruit(type, energy);
        String actual_type = test_fruit.gettype();
        int actual_energy = test_fruit.getengery();
        

        // Then
        Assert.assertEquals(type, actual_type);
        Assert.assertEquals(energy, actual_energy);
    }
    
}