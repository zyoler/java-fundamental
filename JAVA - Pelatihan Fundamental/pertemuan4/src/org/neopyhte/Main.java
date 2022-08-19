package org.neopyhte;

import java.util.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter String: ");
        int angka = Integer.parseInt(input);
        System.out.println("Input angka : " + angka);
        int a=0,b=0;
        for (int i = 1; i <= angka; i++) {
            if(Math.random() < 0.5){
                System.out.println(i + ". Tail");a++;
            }else{
                System.out.println(i + ". Head");b++;
            }
        }
        System.out.println("Head : " + b);
        System.out.println("Tail : " + a);
    }

}
