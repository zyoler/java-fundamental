package org.neopyhte;

import java.io.*;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
//        FileOutputStream fileOutputStream = new FileOutputStream("data.txt");
//        String data = "Dion Ferdian Syam";
//        fileOutputStream.write(data.getBytes());
//
//        // Input
//        FileInputStream fileInputStream = new FileInputStream("data.txt");
//
//        String data2 = new String(fileInputStream.readAllBytes());
//        System.out.println(data2);


        // Output = menulis dari program ke file
//        FileWriter fileWriter = new FileWriter("data.txt");
//        fileWriter.write("Mita Zuriati");
//        fileWriter.flush();

        // Input = membaca dari file ke program

//        FileReader fileReader = new FileReader("data.txt");
//        BufferedReader bufferedReader = new BufferedReader(fileReader);

//        System.out.println(bufferedReader.readLine()); // Muncul baris pertama
//        System.out.println(bufferedReader.readLine()); // Langsung ke baris kedua

//        String baris = bufferedReader.readLine();
//        while (baris != null){
//            System.out.println(baris);
//            baris = bufferedReader.readLine();
//        }

//        bufferedReader.close();


        // STRING TOKENIZER
//        String nama = "Nurul 'Aini";
//        StringTokenizer stringTokenizer = new StringTokenizer(nama," ");
//        System.out.println(stringTokenizer.nextToken());
//        System.out.println(stringTokenizer.nextToken());

        //Membaca file dengan string TOKENIZER

        FileReader fileReader = new FileReader("data.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String baris = bufferedReader.readLine();
        while (baris != null){
            // Membuat objek tokenizer untuk memisahkan string
            StringTokenizer tokenizer = new StringTokenizer(baris,",");
            String nama2 = tokenizer.nextToken();
            String angkatan = tokenizer.nextToken();

//            int angkatan = Integer.parseInt(tokenizer.nextToken());
            System.out.println(nama2 + " - " + angkatan);

            baris = bufferedReader.readLine();
        }

        bufferedReader.close();

    }
}
