package org.neopyhte;

import java.util.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Nama : Dani Hidayat");
        String input = JOptionPane.showInputDialog(null, "Masukan kecepatan: ");
        double kecepatan = Double.parseDouble(input);
        System.out.println("Kecepatan : " + kecepatan);

        String input2 = JOptionPane.showInputDialog(null, "Masukan sudut: ");
        double sudut = Double.parseDouble(input2);
        System.out.println("Sudut :  " + sudut);

        String input3 = JOptionPane.showInputDialog(null, "Masukan waktu: ");
        double waktu = Double.parseDouble(input3);
        System.out.println("Waktu : " + waktu);

        double z = kecepatan*waktu;

        double suduttt = Math.toRadians(sudut);
        double cos = Math.cos(suduttt);
        double sin = Math.sin(suduttt);
        double x = z * cos;
        double y = z * sin;
        System.out.println("posisi K2 (x,y) adalah : " + "(" + x + "," + y +")");

    }
}
