package org.neopyhte;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class
Main {

    public static void main(String[] args) {

        //Sebelym java 8 yaitu date, time, datetime
        //Setelah java 8 yaitu LocalDate = tanggal , LocalTime = waktu, LocalDateTime = tanggal dan waktu

        //Fuungsi adanya setelah java 8 yaitu :
//        1. Lebih aman
//        2. Lebih mudah bagi programmer
//        3. Ada zona waktu


        // LOCALDATE
        // NOW
        LocalDate hariIni = LocalDate.now();
        System.out.println(hariIni); //Format Default YYYY-MM-DD

        // Of
        LocalDate maulidNabi = LocalDate.of(2021,10,19);
        System.out.println(maulidNabi);

        // Parse
        LocalDate tahunBaru = LocalDate.parse("2022-01-01");
        System.out.println(tahunBaru);

        // Plus
        LocalDate besok = hariIni.plusDays(1);
        System.out.println(besok);
        LocalDate kemaren = hariIni.minusDays(1);
        System.out.println(kemaren);
        LocalDate mingguDepan = hariIni.plusWeeks(1);
        System.out.println(mingguDepan);

        // Is Before
        System.out.println(kemaren.isBefore(hariIni)); //TRUE

        // Local Time
        LocalTime detikIni = LocalTime.now();
        System.out.println(detikIni);

        // OF
        LocalTime tidur = LocalTime.of(23,0,0,0);
        System.out.println(tidur);

        // Parse
        LocalTime bangun = LocalTime.parse("04:00");
        System.out.println(bangun);

        // Plus
        LocalTime nanti = detikIni.plusHours(1);
        System.out.println(nanti);

        // Minus
        LocalTime tadi = detikIni.minusHours(1);
        System.out.println(tadi);


        // Local Date Time
        // Now
        LocalDateTime sekarang = LocalDateTime.now();
        System.out.println(sekarang);

        // Period untuk date
        Period jarakTahunBaru = hariIni.until(tahunBaru);
        System.out.println("Tahun baru yaitu " + jarakTahunBaru.getMonths() + " bulan dan " + jarakTahunBaru.getDays() + " hari lagi");

        // Pake between
        Period jarakTahunBaru2 = Period.between(hariIni, tahunBaru);
        System.out.println("Tahun baru yaitu " + jarakTahunBaru2.getMonths() + " bulan dan " + jarakTahunBaru2.getDays() + " hari lagi");
        System.out.println(jarakTahunBaru);
        System.out.println(jarakTahunBaru2);

        // Duration untuk waktu
        Duration jarakNanti = Duration.between(detikIni, tidur);
        System.out.println(jarakNanti.toHours());

        // Date, Time Formatter
        System.out.println(sekarang.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(new Locale("ID"))));

        


    }
}
