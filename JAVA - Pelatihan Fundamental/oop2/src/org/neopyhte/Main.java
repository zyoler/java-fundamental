package org.neopyhte;

abstract class Hero {
    String nama;
    int hitPoint;
}

class Mage extends Hero {
    int magicPower;
}

class Fighter extends Hero {
    int pyhsicalDamage;

    Fighter(String nama,int hitPoint, int pyhsicalDamage) {
        super.nama = nama;
        super.hitPoint = hitPoint;
        this.pyhsicalDamage = pyhsicalDamage;
    }
}

class main {

    public static void main(String[] args) {

        Fighter hero1 = new Fighter("Aldous",4000,700);


    }

}