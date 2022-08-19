package org.neopyhte;

import java.lang.reflect.Array;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//	int[] numbers = {1,2,3,4};
//	Scanner scanner = new Scanner(System.in);
//	System.out.println("Masukan angka : ");
//	int index = scanner.nextInt();
//	try {
//        System.out.printf("Bilangan dari indeks : %f", numbers[index]); //Pemeriksaan
//    } catch (Exception exception) {
//        throw new Exception("Gagal"); // Ketika error
//	} finally {
//        System.out.println("Selalu dicetak"); //Selalu dicetak
//    }
//        System.out.println("Berhasil"); //Ketika berhasil



    int[] numbers = {1,2,3,4};
    Scanner scanner = new Scanner(System.in);
    System.out.println("Masukan angka : ");
    int index = scanner.nextInt();
    try {
        System.out.printf("Bilangan dari indeks : %d", numbers[index]);
    } catch (ArrayIndexOutOfBoundsException exception) {
        throw new Exception("Indeks melebihi batas");
    } catch(InputMismatchException exception) {
        throw new Exception("Input nya salah");
    }
    finally {
        System.out.println("Selalu dicetak");
    }
    System.out.println("Berhasil");

    }
}
