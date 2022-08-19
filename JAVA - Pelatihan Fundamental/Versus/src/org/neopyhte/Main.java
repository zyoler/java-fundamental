package org.neopyhte;

abstract class Hero {
    String name;
    int hitPoint;
    int maxHealthPoint;
    int damage;
    int spesial;

    static void battle(Hero teman, Hero lawan) {
        for (int i = 1; teman.hitPoint > 0 && lawan.hitPoint > 0; i++) {
            if( i % 5 == 0) {
                //1. fighter = lifesteal
                //2. marksman = critical
                //3. mage = skill
                //4. tank = daya tahan
                //5. assasin = damage beruntun
                //6. support = skill
                System.out.println("Spesial Skill Moment");
                if (teman.spesial == 1) {
                    teman.hitPoint += teman.damage * 225 / 100;
                    if(teman.hitPoint >= teman.maxHealthPoint){
                        teman.hitPoint = teman.maxHealthPoint;
                    }
                } else if (teman.spesial == 2) {
                    lawan.hitPoint -= teman.damage * 275 / 100;
                } else if (teman.spesial == 3) {
                    lawan.hitPoint -= teman.damage * 1450 / 100;
                } else if (teman.spesial == 4) {
                    lawan.damage -= lawan.damage * 5 / 100;
                } else if (teman.spesial == 5) {
                    lawan.hitPoint -= teman.damage * 3;
                } else {
                    lawan.hitPoint -= teman.damage;
                    teman.hitPoint += teman.damage;
                }
                System.out.println("Spesial skill hero " + teman.name);
                    if(teman.hitPoint <= 0)     teman.hitPoint = 0;
                    else if(lawan.hitPoint <=0) lawan.hitPoint = 1;
                System.out.println(teman.name + ": " + teman.hitPoint);
                System.out.println(lawan.name + ": " + lawan.hitPoint);

                if (lawan.spesial == 1) {
                    lawan.hitPoint += lawan.damage * 225 / 100;
                    if(teman.hitPoint >= teman.maxHealthPoint){
                        teman.hitPoint = teman.maxHealthPoint;
                    }
                } else if (lawan.spesial == 2) {
                    teman.hitPoint -= lawan.damage * 275 / 100;
                } else if (lawan.spesial == 3) {
                    teman.hitPoint -= lawan.damage * 1450 / 100;
                } else if (lawan.spesial == 4) {
                    teman.damage -= teman.damage * 5 / 100;
                } else if (lawan.spesial == 5) {
                    teman.hitPoint -= lawan.damage * 3;
                } else {
                    teman.hitPoint -= lawan.damage;
                    lawan.hitPoint += lawan.damage;
                }
                    if(teman.hitPoint <= 0)     teman.hitPoint = 0;
                    else if(lawan.hitPoint <=1) lawan.hitPoint = 0;
                System.out.println("Spesial skill hero " + lawan.name);
                System.out.println(teman.name + ": " + teman.hitPoint);
                System.out.println(lawan.name + ": " + lawan.hitPoint);
                System.out.println();
            }else{
                teman.hitPoint -= lawan.damage;
                lawan.hitPoint -= teman.damage;
                    if(teman.hitPoint <= 0)     teman.hitPoint = 0;
                    else if(lawan.hitPoint <=0) lawan.hitPoint = 0;
                System.out.println(teman.name + ": " + teman.hitPoint);
                System.out.println(lawan.name + ": " + lawan.hitPoint);
                System.out.println();
            }
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

class Fighter extends Hero {
    int lifesteal = 1;

    Fighter(String name, int hitPoint, int damage) {
        super.name = name;
        super.hitPoint = hitPoint;
        super.maxHealthPoint = hitPoint;
        super.damage = damage;
        super.spesial = lifesteal;
    }
}

class Marskman extends Hero {
    int critical = 2;

    Marskman(String name, int hitPoint, int damage) {
        super.name = name;
        super.hitPoint = hitPoint;
        super.maxHealthPoint = hitPoint;
        super.damage = damage;
        super.spesial = critical;
    }
}

class Mage extends Hero {
    int skill = 3;

    Mage(String name, int hitPoint, int damage){
        super.name = name;
        super.hitPoint = hitPoint;
        super.maxHealthPoint = hitPoint;
        super.damage = damage;
        super.spesial = skill;
    }
}

class Tank extends Hero {
    int dayaTahan = 4;

    Tank(String name, int hitPoint, int damage){
        super.name = name;
        super.hitPoint = hitPoint;
        super.maxHealthPoint = hitPoint;
        super.damage = damage;
        super.spesial = dayaTahan;
    }
}

class Assasin extends Hero {
    int damageBeruntun = 5;

    Assasin(String name,int hitPoint, int damage){
        super.name = name;
        super.hitPoint = hitPoint;
        super.maxHealthPoint = hitPoint;
        super.damage = damage;
        super.spesial = damageBeruntun;
    }
}

class Support extends Hero {
    int skill = 6;

    Support(String name, int hitPoint, int damage) {
        super.name = name;
        super.hitPoint = hitPoint;
        super.maxHealthPoint = hitPoint;
        super.damage = damage;
        super.spesial = skill;
    }
}

public class Main {

    public static void main(String[] args) {
        //Damage fighter = 75 - 125
        //Hitpoint fighter = 3850 - 5000

        //Damage marksman = 110 - 170
        //Hitpoint marksman = 2950 - 3450

        //Damage mage = 18 - 50
        //Hitpoint mage = 2110 - 2850

        //Damage tank = 5 - 15
        //Hitpoint tank = 6000 - 7500

        //Damage assasin = 110 - 170
        //Hitpoint assasin = 2950 - 3450

        //Damage support = 10 - 35
        //Hitpoint support = 2350 - 3100

        Fighter fighter = new Fighter("Martis", 4600,105);
        Fighter fighter1 = new Fighter("Alucard",4500,122);
        Marskman marskman = new Marskman("Layla",3450,170);
        Mage mage = new Mage("Eudora",2850,50);
        Tank tank = new Tank("Hylos",7500,15);
        Assasin assasin = new Assasin("Lancelot",2950,100);

        Hero.battle(fighter1, assasin);
    }
}