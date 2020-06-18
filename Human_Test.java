package io.codedifferently;

import org.junit.Assert;

import org.junit.Test;

public class Human_Test 
{
    @Test
    public void constructor_test()
    {
        //Given 
        String first = "Fred";
        String last = "Flintstone";
        int energy = 50;
        //When

        Human test_human = new Human(first, last);
        String actual_first = test_human.getfirst_name();
        String actual_last = test_human.getlast_name();
        int actual_energy = test_human.getenergy();
        //Then
        Assert.assertEquals(first, actual_first);
        Assert.assertEquals(last, actual_last);
        Assert.assertEquals(energy, actual_energy);
    }
    @Test 
    public void eat_test()
    {
        // Given 
        Fruit orange = new Fruit("orange", 10);
        int expected_energy = 60;
        Human test_human= new Human("Barney", "Rubble");

        // When 
        test_human.eat(orange);
        int actual_energy = test_human.getenergy();


        // Then
        Assert.assertEquals(expected_energy, actual_energy);
    }

    @Test
    public void work_test()
    {
        // Given 
        Human test_Human = new Human("Fred", "Flintstone");
        int expected_energy = 30;
        // When 
        test_Human.work(2);
        int actual_energy = test_Human.getenergy();
        // Then
        Assert.assertEquals(expected_energy, actual_energy);
    }

    @Test
    public void energy_max_test()
    {
        // Gieven
        Human test_human = new Human("William", "Flintstone");
        Fruit test_fruit1 = new Fruit("Dragon Fruit", 20);
        Fruit test_fruit2 = new Fruit("Apple", 20);
        Fruit test_fruit3 = new Fruit("Grape", 20);
        // When
        test_human.eat(test_fruit1);
        test_human.eat(test_fruit2);
        test_human.eat(test_fruit3);
        int actual_energy = test_human.getenergy();

        // Then 

        Assert.assertEquals(100, actual_energy);
    }

    @Test
    public void work_min()
    {
        // Gievn 
        Human test_human = new Human("Wilma", "Flintstone");
        // When
        test_human.work(6);
        int actual_energy = test_human.getenergy();
        // Then
        Assert.assertEquals(50, actual_energy);
    }
    @Test
    public void max_energy_change_test()
    {
        Human test_human1 = new Human("John", "Doe");
        Fruit test_fruit1 = new Fruit("Dragon Fruit", 20);
        Fruit test_fruit2 = new Fruit("Apple", 20);
        Fruit test_fruit3 = new Fruit("Grape", 20);
        Human.max_ennergy = 150;
        test_human1.eat(test_fruit1);
        test_human1.eat(test_fruit2);
        test_human1.eat(test_fruit3);

        int actual_energy = test_human1.getenergy();

        Assert.assertEquals(110, actual_energy);
    }
}