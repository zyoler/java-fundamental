package org.neopyhte;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        localDate = localDate.plusDays(10);
        System.out.println(localDate);

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        Integer integer = scanner.nextInt();
        
    }
}
