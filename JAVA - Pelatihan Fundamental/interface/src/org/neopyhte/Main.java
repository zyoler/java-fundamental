package org.neopyhte;

interface Manusia {
    int usia = 5;
    void berjalan();
}

interface Makhluk {

    void tumbuh();
}

class Mahasiswa implements Manusia, Makhluk{

    @Override
    public void berjalan() {
        System.out.println("Hai");
    }

    @Override
    public void tumbuh() {
        System.out.println("Hello");
    }
}

public class Main {

    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.berjalan();
        mahasiswa1.tumbuh();
    }
}
