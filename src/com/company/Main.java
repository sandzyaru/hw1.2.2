package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Shelter romashka = new Shelter("Ромашка",
                "ул. Первомайская 9");

        Dog layka = new Dog("Layka", "Шавка", EnumColor.WHITE,
                romashka, new String[]{"Сидеть","Лежать"});
        System.out.println(layka.getInfo());
        layka.makeVoice();
        System.out.println("-------------------");

        Dog rex = new Dog("Rex", "Ovcharka", EnumColor.BLACK, romashka);
        System.out.println(rex.getInfo());
        System.out.println("-------------------");
        Dog baki = new Dog();
        baki.setName("Baki");
        baki.setBreed("Дворняга");
        baki.setCommands(new String[]{"Прыгать","Бежать"});
        baki.setShelter(romashka);
        baki.setEnumColor(EnumColor.BROWN);
        System.out.println(baki.getInfo());

    }
}
