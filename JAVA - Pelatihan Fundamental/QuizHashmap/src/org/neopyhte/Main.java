package org.neopyhte;

import java.util.*;

class Character {
    String name;
    int nilai;

    public Character(String name, int nilai) {
        this.name = name;
        this.nilai = nilai;
    }
}

public class Main {

    public static void main(String[] args) {

        HashMap<String, Character> data = new HashMap<>();
        data.put("kawan1", new Character("Sandi",100));
        data.put("kawan2", new Character("Mamang",95));

        System.out.println("Kawan 1 : " + data.get("kawan1").name);
        System.out.println("Nilai kawan 1 : " + data.get("kawan1").nilai);

        System.out.println("Kawan 2 : " + data.get("kawan2").name);
        System.out.println("Nilai kawan 2 : " + data.get("kawan2").nilai);


    }
}
