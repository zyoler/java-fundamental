package org.neopyhte;

class zzz{
    void hitung(int bilangan1, int bilangan2) {

    }

    void hitung(int bilangan1) {

    }

    void hitung(String bilangan1) {

    }
}

public class Main {

    public static void main(String[] args) {
	    //OVERLOADING yaitu memanggil fungsi sesuai dengan argumen yang kita masukan
        zzz a = new zzz();

        a.hitung(1);
        a.hitung("a");
        a.hitung(1,2);

    }
}
