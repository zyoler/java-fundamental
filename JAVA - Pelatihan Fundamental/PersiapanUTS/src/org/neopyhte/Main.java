package org.neopyhte;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
//Array Biasa ini diisi dengan manual
//        String[] strings = {"Dani","Mita","Seli"};
//        for(String string : strings){
//            System.out.println(string);
//        }
//
//ArrayList bisa langsung diisi
//        ArrayList<String> namaNama = new ArrayList<>();
//        namaNama.add("Dani");
//        namaNama.add("Dion");
//        System.out.println(namaNama.get(1));

//Print sesuai index
//Contains untuk memeriksa apakah data yang kita masukan itu ada
//Semisal data itu ada maka true, jika tidak maka false
//        System.out.println(namaNama.contains("Dani")); //True
//        System.out.println(namaNama.contains("Nurul")); //False
//
//        System.out.println(namaNama.contains("dani")); // true
//        namaNama.remove("dani");                    // dani dihapus
//        System.out.println(namaNama.contains("dani")); // maka ini menjadi false

//add = mennambahkan data
//get = menambahkan data berdasarkan index
//constains = memeriksa ada atau tidaknya data yang sesuai
//isEmpty = memeriksa apakah arrayList itu kosong atau tidak
//remove = menghapus data



//HashSet yaitu tidak bisa ada data duplikasi dan tidak urut dalam dicetak
//Perbedaan arrayList dan HastSet
//1. Arraylist urut ketika dicetak menggunakan forEach, sedangkan HashSet acak
//2. HashSet datanya tidak bisa diduplikasi sedangkan ArrayList bisa


//HashSet versi 1 HashSet biasa yang tidak bisa menggunakan forEach(String) harus diganti ke forEach(Object)
//HashSet versi 2 HashSet versi string yang hanya bisa diisi string
//HashSet versi 3 yaitu HashSet yang bisa diisi tipe data apapun
//        HashSet hashSet = new HashSet();
//        HashSet<String> hashSet1 = new HashSet<>();
//        HashSet<Object> hashSet2 = new HashSet<>();
//
//        hashSet2.add("Ari Sandi");
//        hashSet2.add("Ari Sandi");
//        hashSet2.add("Ari Sandi 2");
//        hashSet2.add("Ari Sandi 3");
//        hashSet2.add(5);
//        hashSet2.add(10);
//        for(Object object: hashSet2){
//            System.out.println(object);
//        }
//        HashSet<String> hashSet = new HashSet<>();
//        hashSet.add("Mita");
//        System.out.println(hashSet.size()); //Menghitung panjang HashSet
//
//        String[] nama = {"Dani","Pororo","Sandi"};
//        System.out.println(nama.length); //Menghitung panjang array

//Penting !!!
// Size() itu berupa method / function / void
// length itu properties


//        ArrayList<String> a = new ArrayList<>();
//        a.add("Aris");
//        a.add("Dion");
//
//        HashSet<String> b = new HashSet<>();
//        b.add("Aris");
//        b.add("Dion");
//        b.add("Romi");
//
//        b.addAll(a); //Menambahkan semua data yang ada di a kedalam b
//        System.out.println(b);
//        b.removeAll(a); //Menghapus semua data yang ada di b yang sama dengan si a
//        System.out.println(b);
//PENTING!!!
//Untuk ngeprint array harus ada tanda [ ]
//Output : ["dani","mita","nurul"]


//PENTING!!!
//Untuk ngeprint object harus menggunakan tanda { }
//Output = {nama=Nurul, angkatan=19}
//HashMap
//        HashMap<String, Object> mahasiswa = new HashMap<>();
//        mahasiswa.put("nama", "Nurul");
//        mahasiswa.put("angkatan",19);
//        System.out.println(mahasiswa);



//Class = Rancangan atau blueprint dari objek
//Object = Perwujudan dari class



    }
}
