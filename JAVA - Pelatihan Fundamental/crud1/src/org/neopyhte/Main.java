package org.neopyhte;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Angkatan {
    int nomor;
    String nama;

    public Angkatan(int nomor, String nama) {
        this.nomor = nomor;
        this.nama = nama;
    }
}

class Mahasiswa {
    String nama;
    Angkatan angkatan;

    public Mahasiswa(String nama, Angkatan angkatan) {
        this.nama = nama;
        this.angkatan = angkatan;
    }
}

public class Main {
    static Scanner scanner = new Scanner(System.in);

    static ArrayList<Angkatan> angkatans = new ArrayList<>();
    static ArrayList<Mahasiswa> mahasiswas = new ArrayList<>();


    public static void main(String[] args) throws IOException {

        Angkatan angkatan18 = new Angkatan(18,"Jarvis");
        Angkatan angkatan19 = new Angkatan(19,"Neophyte");
        angkatans.add(angkatan18);
        mahasiswas.add(new Mahasiswa("Romi Kusuma Bakti", angkatan18));

        System.out.println("CRUD PUB");
        System.out.println("1 - Mahasiswa");
        System.out.println("2 - Angkatan");
        System.out.print("Pilih : ");
        String input = scanner.nextLine();
        switch (input){
            case "1":
                mahasiswa();
                break;
            case "2":
                angkatan();
                break;
            case "k":
                break;
            default:
                System.out.println("Input tidak valid");
                main(null);
        }
    }

    static void mahasiswa() {
        System.out.println("KELOLA MAHASISWA");
        int nomor = 1;
        for (Mahasiswa mahasiswa : mahasiswas){
            System.out.println(nomor++ + mahasiswa.nama + " - " + mahasiswa.angkatan.nama);
        }
    }
    static void angkatan() {
        System.out.println("KELOLA ANGKATAN");
    }

}
