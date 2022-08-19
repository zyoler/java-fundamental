package com.neophyte;

import java.util.*;
import java.sql.*;

    public class Main {
        static Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {
            try{
                Class.forName("org.h2.Driver");
                System.out.println("Berhasil terhubung.");
                try{
                    Connection conn = DriverManager.getConnection("jdbc:h2:./dani");
                    System.out.println("Berhasil terhubung ke database");
                    Statement statement = conn.createStatement();
                    statement.executeUpdate("create table if not exists mahasiswa (id int not null primary key," +
                            "nama varchar(35),nim char(11))");
                    ResultSet rs =statement.executeQuery("select id from mahasiswa order by id desc limit 1");
                    int idi=0;
                    while(rs.next()) {
                        idi = rs.getInt("id");
                    }
                    idi++;
                    PreparedStatement preparedStatement = conn.prepareStatement("insert into mahasiswa values('"+idi+"',?,?)");
                    tambahMahasiswa(preparedStatement);
                    preparedStatement.close();
                    statement.close();
                    conn.close();
                }catch (Exception e){
                    System.out.println(e);
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }

        public static void tambahMahasiswa(PreparedStatement preparedStatement) throws SQLException {
            System.out.println(">> Tambah Data Mahasiswa <<");
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("NIM: ");
            String nim = scanner.nextLine();
            preparedStatement.setString(1,nama);
            preparedStatement.setString(2,nim);
            preparedStatement.executeUpdate();
        }
    }