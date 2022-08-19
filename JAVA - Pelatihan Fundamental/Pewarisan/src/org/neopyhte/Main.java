package org.neopyhte;

abstract class Orang{
    String nama;
    String usia;
    int umur;
}

class Mahasiswa extends Orang{
    String nim;

    void setNim(String nimBaru){
        nim = nimBaru;
        System.out.println("Fungsi atas");
    }

    void setNim(int nimBaru){
        nim = String.valueOf(nimBaru);
        System.out.println("Fungsi bawah");
    }
}

class Dosen extends Orang{
    String nidn;
}

public class Main {

    public static void main(String[] args) {
	    Mahasiswa mahasiswa1 = new Mahasiswa();
	   mahasiswa1.setNim(123);

	   mahasiswa1.setNim("Dani");
    }
}
