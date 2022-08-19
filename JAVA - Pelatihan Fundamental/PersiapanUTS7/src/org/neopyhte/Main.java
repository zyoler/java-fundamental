package org.neopyhte;

abstract class Karakter {

    //Non abstract
    void menyerang(){
        System.out.println("Menyerang");
    }

    //abtract
    abstract void bertahan();
}

class Petarung extends Karakter{

    //Menimpa fungsi yang ada pada induknya, output yang awalnya "Menyerang" bahkan berubah
    @Override
    void menyerang() {
        System.out.println("Petarung menyerang");
    }

    @Override
    void bertahan() {

    }
}

//Interface
interface Karakter2 {
    public void a();
}

class Pemanah implements Karakter2 {

}




public class Main {

    public static void main(String[] args) {

    }
}
