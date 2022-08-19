package org.neopyhte;

class Mahasiswa{
    String nim;
    String nama;
    float ipk;
    static String namaKelas = "mahasiswa";

    Mahasiswa(String nim, String nama, float ipk){
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }

    void cetak(){
        System.out.println(nim + ", " + nama + ", " + ipk);
    }

    static void cetakBilangan(){
        System.out.println("1");
    }
}

public class Main {

    public static void main(String[] args) {
        Mahasiswa.namaKelas = "mhs";
        System.out.println(Mahasiswa.namaKelas);


        /*Mahasiswa mahasiswa1 = new Mahasiswa("123","Dani",4.0f);
        Mahasiswa mahasiswa2 = new Mahasiswa("124","Mita",4.0f);

        mahasiswa1.cetak();
        mahasiswa2.cetak();
        */
    }
}
