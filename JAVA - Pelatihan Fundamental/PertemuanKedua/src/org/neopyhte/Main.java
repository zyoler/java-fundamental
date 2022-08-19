package org.neopyhte;

public class Main {

    public static void main(String[] args) {
        String[] mahasiswa = {"Awaludin","Imron","Sri","Aren","Ari","Arie","Burhannudin"};
        int[] jarak = {98,300,205,150,150,1500,60};
        int tamp;
        float rataRata=0;
        String tam;
        for(int i = 0;i < jarak.length-1; i++){
            for(int j = 0;j < jarak.length-1; j++){
                if(jarak[j] <= jarak[j+1]){
                    tamp=jarak[j];
                    jarak[j]=jarak[j+1];
                    jarak[j+1]=tamp;

                    tam = mahasiswa[j];
                    mahasiswa[j] = mahasiswa[j+1];
                    mahasiswa[j+1] = tam;
                }
            }
        }
        System.out.println("Nama " + mahasiswa[0] + " memiliki jarak paling jauh yaitu " +jarak[0] + "km");
        System.out.println("Nama " + mahasiswa[6] + " memiliki jarak paling dekat yaitu " +jarak[6] + "km");

        for(int i:jarak){
            rataRata+=i;
        }
        System.out.println("Jarak rata-rata mahasiswa PUB ke pasim yaitu " + rataRata/7 + "km");
    }
}
