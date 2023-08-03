package com.prosigmaka.database;

import com.prosigmaka.model.Mahasiswa;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static com.prosigmaka.database.DbHelper.getConnection;

public class MahasiswaDb {
    public static List<Mahasiswa> getAllMahasiswa() {
        List<Mahasiswa> listMahasiswa = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = getConnection();

            String sqlQuery = "SELECT * FROM mahasiswa";
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sqlQuery);
            while (rs.next()) {
                listMahasiswa.add(new Mahasiswa(
                        rs.getInt("nim"),
                        rs.getString("nama"),
                        rs.getDate("tanggal_lahir"),
                        rs.getString("jurusan"),
                        rs.getInt("tahun_masuk")
                ));
            }

            st.close();
        } catch (Exception e) {
            System.err.println(e);
        }

        return listMahasiswa;
    }

    public static boolean addMahasiswa(int nim, String nama, Date tanggal_lahir, String jurusan, int tahun_masuk) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = getConnection();

            String sqlQuery = "INSERT INTO mahasiswa VALUES (?, ?, ?, ?, ?)";
            PreparedStatement st = con.prepareStatement(sqlQuery);
            st.setInt(1, nim);
            st.setString(2, nama);
            st.setDate(3, tanggal_lahir);
            st.setString(4, jurusan);
            st.setInt(5, tahun_masuk);

            int rs = st.executeUpdate();
            if (rs == 1) {
                return true;
            }

            st.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return false;
    }
}
