package org.neopyhte;

import java.util.*;

class Character {
    String name;
    int hitPoint;

    public Character(String name, int hitPoint) {
        this.name = name;
        this.hitPoint = hitPoint;
    }
}

public class Main {

    public static void main(String[] args) {
        //Array
        String[] mahasiswa = {"Aris", "Dani", "Ari"};

        //Array List
        ArrayList<String> dosen = new ArrayList<>();
        dosen.add("Tanjung");

        //Object Array
        Character[] characters = {
            new Character("Sandi",1000),
            new Character("Dani",1000),
            new Character("Aris",1000)
        };

        //Object array list
        ArrayList<Character> characters1 = new ArrayList<>();
        characters1.add(new Character("Sandi",1000));
        characters1.add(new Character("Sandi",1000));
        characters1.add(new Character("Sandi",1000));

        for(Character character : characters1){
            System.out.println(character.name + " ,HP: " + character.hitPoint);
        };


        for(String x : mahasiswa){
            System.out.println(x);
        }

        HashMap<String, Character> data = new HashMap<>();
        data.put("kawan", new Character("Sandi",1000));
        data.put("lawan", new Character("Mamang",1000));
        data.put("hantu", characters[1]);

        System.out.println("Kawan : " + data.get("kawan").name);
        System.out.println("Lawan : " + data.get("lawan").name);
        System.out.println("Hantu : " + data.get("hantu").name);

    }
}
