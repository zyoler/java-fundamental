package org.neopyhte;

//JDBC API
import java.sql.*;

public class Main {

    public static void main(String[] args) {
        try{
            Class.forName("org.h2.Driver");
            System.out.println("Berhasil terhubung");
            try{
                Connection conn =  DriverManager.getConnection("jdbc:h2:./dani");
                System.out.println("Berhasil terhubung ke basis data.");

                Statement stmt = conn.createStatement();
                stmt.executeUpdate("CREATE TABLE IF NOT EXISTS mahasiswa(nim CHAR(4) PRIMARY KEY NOT NULL, nama VARCHAR(20))");

//                stmt.executeUpdate("INSERT INTO mahasiswa VALUES('0002','ROMI'),('0003','ARIS')");

                ResultSet rs = stmt.executeQuery("SELECT * FROM mahasiswa");

                while (rs.next()){
                    System.out.print(rs.getString("nim") + ", ");
                    System.out.println(rs.getString("nama"));
                }

                stmt.close();
                conn.close();
            } catch (Exception e){
                System.out.println(e);
            }

        } catch (Exception e){
            System.out.println("Gagal terhubung ke driver.");
        }
    }
}