package org.neopyhte;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[400];
        double total = 0;

        for(int i = 0; i < array.length ; i++){
            double angka = Math.random() * 50;
            total += Math.pow(angka,4);
            System.out.println("Nilai ke-" + ( i + 1 ) + " = " + angka);
        }
        System.out.println("Total Jumlah = " + total);
    }
}