package org.neopyhte;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int angka;
        Scanner input = new Scanner (System.in);
        System.out.print("Masukan angka : ");
        angka = input.nextInt();
        for (int i = 0; i < angka; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("x");
            }
            System.out.print("\n");
        }




















/*
        int pilih,pilihBukuPelajaran,jumlah,x=0,y=0,z=0,alamat;
        float ongkir=0,total=0;
        float diskon=0.02F;
        Scanner input = new Scanner(System.in);
        System.out.println("===========================================");
        System.out.println("|          PENJUALAN BUKU ONLINE          |");
        System.out.println("===========================================");
        System.out.println("|               Jenis Buku                |");
        System.out.println("===========================================");
        System.out.println("| 1.Buku Pelajaran                        |");
        System.out.println("| 2.Buku Novel                            |");
        System.out.println("| 3.Buku Sejarah                          |");
        System.out.println("===========================================");
        do {
            System.out.print("Pilih  :");
            pilih = input.nextInt();
            if (pilih == 1) {
                y++;
                System.out.println("===========================================");
                System.out.println("|               Daftar Buku               |");
                System.out.println("===========================================");
                System.out.println("| 1.Buku Matematika         Rp 75.000     |");
                System.out.println("| 2.Buku Fisika             Rp 60.000     |");
                System.out.println("| 3.Buku Biologi            Rp 80.000     |");
                System.out.println("===========================================");
                do{
                    System.out.print("Pilih Buku :");
                    pilihBukuPelajaran = input.nextInt();
                    if(pilihBukuPelajaran == 1){
                        x++;
                        System.out.print("Jumlah Buku :");
                        jumlah = input.nextInt();
                        total +=75000*jumlah;
                    }else if(pilihBukuPelajaran == 2){
                        x++;
                        System.out.print("Jumlah Buku :");
                        jumlah = input.nextInt();
                        total +=60000*jumlah;
                    }else if(pilihBukuPelajaran == 3){
                        x++;
                        System.out.print("Jumlah Buku :");
                        jumlah = input.nextInt();
                        total +=80000*jumlah;
                    }else{
                        System.out.println("Inputan Salah");
                    }
                }while(x!=1);
            }else if (pilih == 2) {
                y++;
                System.out.println("===========================================");
                System.out.println("|               Daftar Buku               |");
                System.out.println("===========================================");
                System.out.println("| 1.Buku Antares           Rp 100.000     |");
                System.out.println("| 2.Buku Hujan             Rp  85.000     |");
                System.out.println("| 3.Buku Tereliye          Rp  90.000     |");
                System.out.println("===========================================");
                do{
                    System.out.print("Pilih Buku :");
                    pilihBukuPelajaran = input.nextInt();
                    if(pilihBukuPelajaran == 1){
                        x++;
                        System.out.print("Jumlah Buku :");
                        jumlah = input.nextInt();
                        total +=100000*jumlah;
                    }else if(pilihBukuPelajaran == 2){
                        x++;
                        System.out.print("Jumlah Buku :");
                        jumlah = input.nextInt();
                        total +=85000*jumlah;
                    }else if(pilihBukuPelajaran == 3){
                        x++;
                        System.out.print("Jumlah Buku :");
                        jumlah = input.nextInt();
                        total +=90000*jumlah;
                    }else{
                        System.out.println("Inputan Salah");
                    }
                }while(x!=1);
            }else if (pilih == 3) {
                y++;
                System.out.println("===========================================");
                System.out.println("|               Daftar Buku               |");
                System.out.println("===========================================");
                System.out.println("| 1.Buku Wikipedia           Rp 110.000   |");
                System.out.println("| 2.Buku Ensiklopedia        Rp 115.000   |");
                System.out.println("===========================================");
                do{
                    System.out.print("Pilih Buku :");
                    pilihBukuPelajaran = input.nextInt();
                    if(pilihBukuPelajaran == 1){
                        x++;
                        System.out.print("Jumlah Buku :");
                        jumlah = input.nextInt();
                        total +=110000*jumlah;
                    }else if(pilihBukuPelajaran == 2){
                        x++;
                        System.out.print("Jumlah Buku :");
                        jumlah = input.nextInt();
                        total +=115000*jumlah;
                    }else{
                        System.out.println("Inputan Salah");
                    }
                }while(x!=1);
            }else{
                System.out.println("Inputan salah");
            }

        }while(y!=1);
        System.out.println("Paket akan dikirim ke:\n1.Pulau Jawa\n2.luar pulau jawa");
        do{
            System.out.println("Pilih :");
            alamat = input.nextInt();
            if(alamat==1){
                z++;
                if(total>=250000){
                    total=total - (total*diskon);
                }else if(total>=150000){

                }else{
                    ongkir = 18000;
                    total += ongkir;
                }
            } else if(alamat==2){
                z++;
                if(total>=250000){
                    ongkir=total*2/100;
                    total=total-ongkir;
                    ongkir=0;
                }else if(total>=150000){

                }else{
                    ongkir = 32000;
                    total += ongkir;
                }
            }
        }while(z!=1);
        System.out.println("Total Bayar :"+total);
        System.out.println("ongkir :"+ongkir);
*/
    }
}
