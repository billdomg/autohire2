package com.mains.Animals;

import java.util.ArrayList;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        new Main();
    }

    public Main() {

        List<Animal> animalList = new ArrayList<>(); // A list of dogs and Cats
        List<Domestic> domesticList = new ArrayList<>(); // A list of dogs and Cats
        List<Wild> wildList = new ArrayList<>(); // A list of Lions and Zebras
        List<Cat> catList = new ArrayList<>(); // A list of cat onlys but with Angoras and Persians
        List<Dog> dogList = new ArrayList<>();

        domesticList.add(0, new Domestic());
        domesticList.add(1, new Cat());
        domesticList.add(2, new Dog());
        wildList.add(0, null);
        catList.add(0, null);
        dogList.add(0, null);

        setDomestic1(domesticList);
        setDomestic2(dogList);
        setDomestic3(animalList);

    }

    private void setDomestic1(List <Domestic> domesticList) // Generics 
    {   }                                                   // List with Domestic
    private void setDomestic2(List <Dog> dogList) // Generecs & lower bound wildcards
    {   }                                                          // List with Domestic or lower classes
    private void setDomestic3(List <Animal> animalList) // Generics & upper bound wildcards
    {   }                                                        // List with Domestic or upper classes 

}
