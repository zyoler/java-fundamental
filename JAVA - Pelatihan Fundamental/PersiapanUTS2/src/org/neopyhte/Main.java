package org.neopyhte;

//Method yang static di property harus static

class Mahasiswa {
    //Property
    static int nim;
    public static String nama;

    //Method Static
    static int getNim(){
        return nim;
    }

    //Method nonStatic
    String getNama(){
        return nama;
    }
}

public class Main {

    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        System.out.println(mahasiswa.getNama());

        System.out.println(Mahasiswa.nama);

    }
}
