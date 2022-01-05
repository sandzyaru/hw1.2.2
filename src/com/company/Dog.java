package com.company;

import java.util.Arrays;

public final class Dog extends Pet {




    public Dog(String name, String breed,
               EnumColor enumColor, Shelter shelter) {
        super.setName(name);
        super.setBreed(breed);
        super.setEnumColor(enumColor);
        super.setShelter(shelter);
    }

    public Dog(String name, String breed,
               EnumColor enumColor, Shelter shelter, String[] commands) {
      /*  this.name = name;
        this.breed = breed;*/
        super.setName(name);
        super.setBreed(breed);
        super.setCommands(commands);
        super.setEnumColor(enumColor);
        super.setShelter(shelter);
    }
    public Dog(){}



    public void makeVoice() {
        System.out.println(super.getName() + " Гав гав");
    }

    public void makeVoice(String voice) {
        System.out.println(voice);
    }

    /*public String getInfo() {
        if (commands != null) {
            return super.getInfo() +
                    "\nName: " + name +
                    "\nBreed: " + breed +
                    "\nCommands: " + Arrays.toString(commands);
        } else {
            return super.getInfo() +
                    "\nName: " + name +
                    "\nBreed: " + breed;
        }
    }*/

}
