package org.neopyhte;

import java.util.Scanner;
import java.util.Locale;

class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        int kecepatan;
        float jarak;
        float waktu;
        System.out.print("Jarak (KM) : ");jarak = input.nextFloat();
        System.out.print("Kecepatan (KM/Jam) : ");kecepatan = input.nextInt();
        waktu = jarak / kecepatan;
        System.out.println("Waktu yang didapat : " + waktu);
    }
}