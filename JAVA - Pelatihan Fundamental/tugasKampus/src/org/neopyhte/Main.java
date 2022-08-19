package org.neopyhte;

public class Main {

    static void nomor1(){
        int a=0,b=0;
        for (int i = 1; i <= 10; i++) {
            if(Math.random() < 0.5){
                System.out.println(i + " Tail");a++;
            }else{
                System.out.println(i + " Head");b++;
            }
        }
        System.out.println("Head : " + b);
        System.out.println("Tail : " + a);
    }

    static void nomor2(){
        double[] numbers = {Math.random(),Math.random(),Math.random(),Math.random()};
        for(double x : numbers){
            System.out.println(x);
        }
    }

    static void nomor3(){
        double tamp = 0;
        double[] numbers = new double[100];
        for (int i = 0; i < 100; i++) {
            numbers[i] = Math.sqrt(Math.random());
            tamp+=numbers[i];
        }
        System.out.println(tamp);
    }

    public static void main(String[] args) {
        nomor3();
    }
}
