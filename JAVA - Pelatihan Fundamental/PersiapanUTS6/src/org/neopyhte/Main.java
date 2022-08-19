package org.neopyhte;

//EXTENDS = Pewarisan

class Senjata {
    String nama;
    int kekuatan;
}

class Pedang extends Senjata{
    int dayaTahan;
}

class Busur extends Senjata {
    int jarak;
}

class Karakter {
    String nama;
    int darah;

    static Karakter tandingkan(Karakter karakter1, Karakter karakter2){
        while(karakter1.darah >0 || karakter2.darah >0) {

        }

    }
}

class Petarung extends Karakter {
    void setSenjata(Pedang senjata) {
        super.senjata = senjata;
    }
}

class Pemanah extends Karakter {
    Busur busur;
    void setSenjata(Busur senjata) {
        super.senjata = senjata;
    }
}

class Multitalent extends Karakter {
    Senjata senjata;
}

public class Main {

    public static void main(String[] args) {
        Busur busur1 = new Busur();
        busur1.nama = "Busur api";
        busur1.kekuatan = 2;
        busur1.jarak = 10;

        Pedang pedang1 = new Pedang();
        pedang1.nama = "Pedang halilintar";
        pedang1.kekuatan = 3;
        pedang1.dayaTahan = 1;

        Pemanah karakter1 = new Pemanah();
        karakter1.nama = "Dani";
        karakter1.darah = 12;
        karakter1.busur = busur1;

        Petarung karakter2 = new Petarung();
        karakter2.nama = "Dion";
        karakter2.darah = 10;
        karakter2.pedang = pedang1;

        Multitalent karakter3 = new Multitalent();
        karakter3.nama = "Ari";
        karakter3.darah = 3;
        karakter3.senjata = busur1;



    }
}
