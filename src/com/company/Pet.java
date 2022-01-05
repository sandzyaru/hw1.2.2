package com.company;

import java.util.Arrays;
import java.util.Random;

public class Pet {
    private String name;
    private String breed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    private String[] commands;

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    private int age = generateDefaultAge();
    private Shelter shelter;
    private EnumColor enumColor;

    public int getAge() {
        return age;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    public EnumColor getEnumColor() {
        return enumColor;
    }

    public void setEnumColor(EnumColor enumColor) {
        this.enumColor = enumColor;
    }

    private int generateDefaultAge() {
        Random random = new Random();
        return random.nextInt(10) + 1;
    }

   /* protected final String getInfo() {
        return "Age: " + age +
                "\nColor: " + enumColor +
                "\nShelter name: " + shelter.getName() +
                "\nShelter address: " + shelter.getAddress();
    }*/
   public final String getInfo() {
       if (commands != null) {
            return "Age: " + age +
                    "\nColor: " + enumColor +
                    "\nShelter name: " + shelter.getName() +
                    "\nShelter address: " + shelter.getAddress()+
                    "\nName: " + name +
                   "\nBreed: " + breed +
                   "\nCommands: " + Arrays.toString(commands);
       } else {
           return
                   "\nName: " + name +
                   "\nBreed: " + breed;
       }
   }
}
