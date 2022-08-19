package org.neopyhte;

abstract class Hero {
    String name;
    int hitPoint;
    Senjata senjata;
    boolean isAlive = true;

    static void battle(Hero teman, Hero lawan) {
        while (teman.hitPoint > 0 && lawan.hitPoint > 0) {
            teman.hitPoint -= lawan.senjata.damage;
            lawan.hitPoint -= teman.senjata.damage;
            System.out.println("Hero 1: " + teman.hitPoint);
            System.out.println("Hero 2: " + lawan.hitPoint);
            System.out.println();
            System.out.println(this.name);
        }
        if (teman.hitPoint <=0 && lawan.hitPoint <=0){
            System.out.println(teman.name + " You has slain the enemy");
            System.out.println(lawan.name + " You has been slained");
        } else if (teman.hitPoint <= 0) {
            System.out.println(teman.name + " You has slain the enemy");
        } else {
            System.out.println(lawan.name + " You has been slained");
        }
    }
}

class HeroDoubleDegree extends Hero {

    public HeroDoubleDegree(String name, int hitPoint, Senjata senjata) {
        super.name = name;
        super.hitPoint = hitPoint;
        super.senjata = senjata;
    }
}

class Fighter extends Hero {
    int physicalDamage;

    Fighter(String name, int hitPoint, int physicalDamage, Pedang pedang) {
        super.name = name;
        super.hitPoint = hitPoint;
        super.senjata = pedang;
        this.physicalDamage = physicalDamage;
    }
}

class Marskman extends Hero {
    int attackSpeed;

    Marskman(String name, int hitPoint, int attackSpeed, Busur busur) {
        super.name = name;
        super.hitPoint = hitPoint;
        super.senjata = busur;
        this.attackSpeed = attackSpeed;
    }
}

class Mage extends Hero {
    int skill;

}

class Senjata {
    String nama;
    int damage;
}

class Pedang extends Senjata {
    public Pedang(String nama, int damage) {
        this.nama = nama;
        this.damage = damage;
    }
}

class Busur extends Senjata {
    int jarak;
    public Busur(String nama, int damage, int jarak) {
        this.nama = nama;
        this.damage = damage;
        this.jarak = jarak;
    }
}

class Tongkat extends Senjata {
    String elemen;
    public Tongkat(String nama, int damage, String elemen) {
        this.nama = nama;
    }
}

public class Main {

    public static void main(String[] args) {

        Pedang pedang1 = new Pedang("Pedang Halilintar", 8);
        Pedang pedang2 = new Pedang("Pedang Api", 9);
        Pedang pedang3 = new Pedang("Keris Petir", 8);

        Busur busur1 = new Busur("Busur Api", 8, 50);
        Busur busur2 = new Busur("Busur Petir", 8, 75);
        Busur busur3 = new Busur("Busur Halilintar", 200, 100);

        Tongkat tongkat1 = new Tongkat("Tongkat Api", 8, "Api");
        Tongkat tongkat2 = new Tongkat("Tongkat Air", 7, "Air");
        Tongkat tongkat3 = new Tongkat("Tongkat Es", 4, "Es");

        Fighter teman = new Fighter("Dani", 1000, 10, pedang1);
        HeroDoubleDegree lawan = new HeroDoubleDegree("Ari Sandi", 100, busur3);


        Hero.battle(teman, lawan);
    }
}